package day18_ForLoop;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstName = scan.next();//"Cybertek";// to scan.next()
        String lastName = scan.next();//"School";// to scan.net()

       /* firstName.substring(0, 1);//get charac at 0=c
        lastName.substring(0, 1);// get charac at 0=s

        String initial = firstName.substring(0, 1) + "." +lastName.substring(0, 1);
        System.out.println(initial);//CS is result concat
*/
        char ch1 = firstName.charAt(0);
        char ch2 = lastName.charAt(0);

        String initial2 = ""+ch1+"." +ch2+".";//now get C.S.
                initial2 = initial2.toUpperCase();// need to initialize
        System.out.println(initial2);// CS if in lower case use uppercase methond

        //System.out.println(ch1 + ch2);// get 150 Cybertek School == concat to get a string




    }
}
