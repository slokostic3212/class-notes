package day16_String;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {//yES YES yEs yes YeS ==> yes
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you employed");

        String answer = scan.next();// add .toLowerCase() yet smarter way is to use ignorecase method
        if (answer.equalsIgnoreCase("yes") ){
            System.out.println("Employed");

        }else{
            System.out.println("Not employed");//all on upper so need to get method ot ingnor case sensitivity

            //contains

            String str = "I like to learn java programing language";
            System.out.println(str.contains("python"));//false str does not contain pythong
            System.out.println(!str.contains("python"));//true
            System.out.println(str.contains("java"));//true
            System.out.println(str.contains("JAVA"));//false becuz upper case and str has lower case

            //startsWith():

            String s1 = "Slo";
            System.out.println( s1.startsWith("S"));           //true
            System.out.println(s1.startsWith("3"));//false

            System.out.println(s1.startsWith("Sl"));// true
            System.out.println(s1.toLowerCase().contains("sl"));//true

        }

    }
}
