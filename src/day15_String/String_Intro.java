package day15_String;

import java.lang.String;
import java.util.Scanner;

public class String_Intro {

    public static void main(String[] args) {
        String str = "Cybertek";       //
        // Scanner input = new Scanner(System.in);

        String name = "Cybertek";// string literal
       // String name2 = new String(orginial:"Cybertek"); string new name

        String s1 = "Cat"; // created using String literal
        String s2 = "Cat"; // string literal

        System.out.println( s1 == s2);

        String d1 = "Dog";//string lit
        String d2 = "dog";// string lit = 1 object shared by 2 variables change to lower case d
                            //now have 2 objects == false

        System.out.println( d1 == d2 );

        String t1 = new String("Tiger");
        String t2 = new String("Tiger");

        System.out.println(t1 == t2);

        //                 new String("Tiger") == new String("Tiger") ==> false

        System.out.println("=======================================");

        String c1 = "Cybertek"; // created in string pool
        String c2 = new String("Cybertek"); // created in java heap

        // not in same memory location ==> get false ==> same visible text yet in diff
        // locations and

        String c3 = new String("Cybertek");
        String c4 = "Cybertek";
        String c5 = "cybertek";
        System.out.println( c2 == c3);// false
        System.out.println( c1 == c2);//false
        // c 1 == c2 == one object 2 variables due to being string literals
        System.out.println( c4 == c5 );

        System.out.println("====================================");

        String str1 = "Java";// objects now
        str1 = "JavaScript";

        System.out.println(str1);

    }
}
