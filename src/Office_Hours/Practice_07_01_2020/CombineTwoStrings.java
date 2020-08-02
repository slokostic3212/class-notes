package Office_Hours.Practice_07_01_2020;
/*. Ask user to enter two words. Then add them together and print. But if the last letter if the first word and the first letter of the last letter is the same, print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight
*/

import java.util.Scanner;

public class CombineTwoStrings {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String str1 = "Java is programming Language";//one  to cy // "Java is programming Language"
                    // 012   get Java is programming LanguageSchool
        String str2 = "School";// eight to school ch back to eight

        String s1 = str1.substring( str1.length() -1);// get last char from subst method
                        // sustring(2, 3) ==>e
        String s2 = str2.substring(0,1); // first char from second word but need to give -1 as an
                                        // ending index otherwise everything will print ==> e

        if (s1.equals(s2)){
            System.out.println(str1 + str2.substring(1));//result oneight
        }else{
            System.out.println(str1 + str2);// willget CybertekSchool
        }

            // third sol
        // char to string use "" + concatination

/*
               // cybertekschool

        String str1 = scan.next();
        String str2 = scan.next();



        //String str1 = "One";// last letter of first word same as last of second chg to cybertek
       // String str2 = "tow";// eight. chg to two  get onetow chg to school = cybertekschool
                           //   01234

        char ch1 = str1.charAt( str1.length() -1);// gives me charac from str1
        char ch2 = str2.charAt(0);// find first charac from second str2
                    // if not equal u get str1 and str2

        if (ch1 == ch2 ){
            System.out.println(str1 + str2.substring(1));// excluding first char of second str2
                                                        // oneight result
        }else{
            System.out.println(str1 + str2);// get same
        }
*/
    }
}
