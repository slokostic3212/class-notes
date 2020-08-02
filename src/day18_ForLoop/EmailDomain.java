package day18_ForLoop;
/* write a program that will return the domain of an email address:
            Ex:
                input: test@gmail.com
                output: the domain of the email is: gmail
                inputL: Cybertek@yahoo.com
                output: the domain of the email is: yahoo
*/

import java.util.Scanner;

public class EmailDomain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
      /*  String email = "cybertek@gmail.com";//
        //                012345678
        int index1 = email.indexOf("@");
        int index2 = email.lastIndexOf(".");
        System.out.println(index1);//8
        System.out.println(index2);//14

        String domain = email.substring(index1 +1, index2 +1);//gmail must pass a variable and not #

        System.out.println(domain);//

       */


    }

}
