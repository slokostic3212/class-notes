package day22_NestedLoop;
/*
2. Write a program that can asks user to enter one string and one char and then returns the frequency of str2 in str1


            Ex
                 Input: AABAAC
                        A
                 Output: 4
                Input: ABCC
                       C
                Output: 2
 */

import java.util.Scanner;

public class OccurancesOFChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        char ch = scan.next().charAt(0);


       // String str = "aaaaaaaaaaaabbbbbbbccccaaaa";// chg to aaaaaaaaaaaabbbbbbbccccaaaa from ababc
       // char ch = 'a';

        int count = 0;//1 means a already occurred once then b !=a so false so count will not increase by 1
                       // 3rd time so count increase by 1 = 2 4th time b !=a so no increase 5th inc c !=a no inc
                        // only increase count if a occurs in count
                       // 1+1 = 2 the freq of ch in str
        // 2 expected occurances // better to use loop cuz u may have a diff string w 100 times

        for ( int i = 0; i <= str.length()-1; i++){

            char each = str.charAt(i);// a b a b c // if during each execution each chara of string is the same as
                                        // given char then we can say it occurred during this execution  so need
                                        // another variable to tell me when == count

            if (each == ch ){// if true means ch occured in str
                count +=1;// if it occured again i would count it again
            }
        }


  /*      int index = 0;  second soln
        while (index <= str.length()-1){

            char each = str.charAt(index);
            if (each == ch ){
                count +=1;
            }
            index++;
        }
*/
        System.out.println(count);
    }
}
