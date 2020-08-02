package day16_String;

import java.util.Scanner;

/*
NOTE: you will need nested If
Write a program StartEndWords:
    you have 2 words that must be 5 characters, and check if last letter of first word and first letter of second work are same.
        if either one not 5 chars length:    print "need to be exactly 5 chars length"
        if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
        if they do not match:  print "Buzz - did not match"
 */
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word");

        String word1 = scan.next();

        System.out.println("Enter your second word");
        String word2 = scan.next();


/*
        if (result){
            char ch1 = word1.charAt(word1.length() -1); // last charac of the first word
            char ch2 = word2.charAt(0); // first character of the second word

            if(ch1 == ch2){
                System.out.println("Fizz");// used words lower radar

            }else{
                System.out.println("Buzz");// used trump cnnnn
            }

        }else {
            System.out.println("needs to be exactly 5 chars length");// used apple mac
        }
*/

        //boolean b1 = word1.length() == 5 && word2.length() == 5;
        //if (result){
            //                                "" +  'A' ==> "A"
            boolean b1 = word1.endsWith( ""+word2.charAt(0) ); // word1 ends with first character of word2
            boolean b2 = word2.startsWith( ""+ word1.charAt(word1.length()-1) );  // word2 starts with the last character of word1

            if( b1 && b2 ) {
                System.out.println("Fizz");
            }else{
                System.out.println("Buzz");
            }



        }




    }

