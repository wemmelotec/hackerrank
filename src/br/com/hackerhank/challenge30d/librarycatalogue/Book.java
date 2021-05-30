package br.com.hackerhank.challenge30d.librarycatalogue;
//esse será o objeto de nossa biblioteca
public class Book {
    //Properties, fields, global variables
    String title;
    int pageCount;
    int isbn;
    boolean isCheckeOut; //se o livro foi retirado ou não, ou seja, se ele está disponível
    int dayCheckedOut = -1; //dia da saída, começa com -1 pois ainda não foi verificado
    //Constructor
    //preciso dessas informações para criar(instanciar) um book
    public Book(String bookTitle, int bookPageCount, int bookISBN){
        this.title = bookTitle;
        this.pageCount = bookPageCount;
        this.isbn = bookISBN;
        //como estou apenas criando, a verificação se foi retidada é false
        this.isCheckeOut = false;
    }

    //Getters - são métodos da instância
    public String getTitle() {
        return this.title;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public int getIsbn() {
        return this.isbn;
    }

    public boolean isCheckeOut() {
        return this.isCheckeOut;
    }

    public int getDayCheckedOut() {
        return this.dayCheckedOut;
    }

    //setters
    public void setIsCheckeOut(boolean newIsCheckeOut, int currentDayCheckedOut) {
        this.isCheckeOut = newIsCheckeOut;//passando se o livro está retirado ou não
        setDayCheckedOut(currentDayCheckedOut);//passando o dia da verificação
    }
    //fiz ele privado para que o unico de possa chamá-lo para alterar seja o método acima
    private void setDayCheckedOut(int day){
        this.dayCheckedOut = day;
    }
}
