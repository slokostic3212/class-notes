package day15_String;
/*
write a program that ask the user to enter a sentence
	print out first and last characters

 */
import java.util.Scanner;

public class Practice3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String sentence = scan.nextLine();

        int lastIndexNum = sentence.length() -1;

        System.out.println(sentence.charAt(0) );
        System.out.println(sentence.charAt( sentence.length() -1));

        System.out.println(""+sentence.charAt(0) + sentence.charAt( lastIndexNum));// addtiont
        //                     J                         n
        //                      74                      110= 185 when Java is fun

        // at  "" + to above System.out.println(""+sentence.charAt(0) + sentence.charAt( lastIndexNum));


    }
}
