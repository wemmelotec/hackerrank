package br.com.hackerhank.challenges;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Tag Content Extractor
public class Challenge23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());

        while (testCases-- > 0) {
            String line = scan.nextLine();

            boolean matchFound = false;
            /*
            <(.+)> matches HTML start tags. The parentheses save the contents inside the brackets into Group #1.
            ([^<]+) matches all the text in between the HTML start and end tags. We place a special restriction on the text in that it can't have the "<" symbol. The characters inside the parenthesis are saved into Group #2.
            </\\1> is to match the HTML end brace that corresponds to our previous start brace. The \1 is here to match all text from Group #1.
             */
            Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
                System.out.println(matcher.group(2));
                matchFound = true;
            }
            if ( ! matchFound) {
                System.out.println("None");
            }
            testCases--;
        }
    }
}
