package br.com.hackerhank.challenge30d.librarycatalogue;

import java.util.HashMap;
import java.util.Map;

public class LibraryCalalogue {
    //propriedades de nossa biblioteca
    Map<String, Book> bookCollection = new HashMap<>();
    int currentDay = 0;
    int lengthOfCheckoutPeriod = 7;
    double initialLateFee = 0.50;
    double feePerLateDay = 1.00;

    public LibraryCalalogue(Map<String, Book> bookCollection) {
        this.bookCollection = bookCollection;
    }

    public LibraryCalalogue(Map<String, Book> bookCollection, int lengthOfCheckoutPeriod, double initialLateFee, double feePerLateDay) {
        this.bookCollection = bookCollection;
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
    }

    //getters
    public Map<String, Book> getBookCollection() {
        return bookCollection;
    }

    public int getCurrentDay() {
        return currentDay;
    }

    public int getLengthOfCheckoutPeriod() {
        return lengthOfCheckoutPeriod;
    }

    public double getInitialLateFee() {
        return initialLateFee;
    }

    public double getFeePerLateDay() {
        return feePerLateDay;
    }

    public Book getBook(String bookTitle) {
        return getBookCollection().get(bookTitle);
    }

    //setters
    public void nextDay() {
        currentDay++;
    }

    public void setDay(int day) {
        currentDay = day;
    }

    //instance methods
    public void checkOutBook(String title) { //dar saída
        Book book = getBook(title);
        if (book.isCheckeOut) {
            sorryBookAlreadyCheckedOut(book);
        } else {
            book.setIsCheckeOut(true, currentDay);
            System.out.println("You just checked out " + title + ". It is due on day " + (getCurrentDay() + getLengthOfCheckoutPeriod())
                    + ".");
            ;
        }
    }

    public void returnBook(String title) { //fazer devolução
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckoutPeriod());
        if (daysLate > 0) {
            System.out.println("You owe the library $" + (getInitialLateFee() + daysLate * getFeePerLateDay())
                    + " because your book is " + daysLate + " days overdue.");
        } else {
            System.out.println("Book returned. Thank You!");
        }
        book.setIsCheckeOut(false, -1);
    }

    public void sorryBookAlreadyCheckedOut(Book book) {
        System.out.println("Sorry "+book.getTitle()+ "is already checked out. It should be back on day "
                + (book.getDayCheckedOut()+getLengthOfCheckoutPeriod())+".");
    }
    public static void main(String[] args) {
        Map<String, Book> bookCollection = new HashMap<>();
        Book harry = new Book("Harry Potter",827132, 9999999);
        bookCollection.put("Harry Potter",harry);
        LibraryCalalogue lib = new LibraryCalalogue(bookCollection);

        lib.checkOutBook("Harry Potter");
        lib.nextDay();
        lib.nextDay();
        lib.checkOutBook("Harry Potter");
        lib.setDay(17);
        lib.returnBook("Harry Potter");
        lib.checkOutBook("Harry Potter");
    }
}
