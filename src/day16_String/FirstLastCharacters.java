package day16_String;
/*
ask user to enter a word

	print true is the first and last charact of the string are the same
	characters

	print false otherwise

		input:
		 	abba

		 output:
		 	true

 */


import java.util.Scanner;

public class FirstLastCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();// can close if done w this scanner
        scan.close();

        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length() -1);

        //System.out.println( firstChar == lastChar);//used word level == true used abc == false w if statement below

        if  (firstChar == lastChar){
            System.out.println("true");

        }else{
            System.out.println("false");
        }
    }
}
