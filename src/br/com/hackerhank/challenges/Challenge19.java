package br.com.hackerhank.challenges;
//Java String Tokens
public class Challenge19 {
    public static void main(String[] args) {
        String str1 = "He is a very very good boy, isn't he?";

        System.out.println(str1.trim().length());
        System.out.println(str1.length());
        if (str1.trim().length()==0 || str1.trim().length()>400000)
        {
            System.out.println(0);
            return;
        }
        String[] arrayStri1 = str1.split("[ !,?.\\\\_'@]+");

        System.out.println(arrayStri1.length);

        for (String x:arrayStri1) {
            System.out.println(x.trim());
        }
    }
}
