package day20_WhileLoops;
/*
3 Write a program that can remove the duplicates from any given  String

 	ex input = abcabcaabb
 	   output = abc
 */

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result = scan.nextLine();
        String str = "aabb"; // remove dups = ab 4 characters w 0-3 index cng to abab
        //            0123

        //String result = "";// 1st "ab" // will add or not add to get the non duplicated characters


        for(int i = 0; i<= str.length()-1; i++){
               // String s = ""+str.charAt(i);// value s is a in firts execution then a then b then b
                    // a b a b in executions 1-4
                //is a in result - true not there so it will be there now = for 2nd time result does not ontain b = true
                // so b will be concated to reult = = added - 3rd time false because a is there so you skip
                // last time executed  = result does not contain be = false = b will not be concated
                    String s = str.substring(i, i+1);// can use substring method

                    if (!result.contains(s)){ //! not contained - if charac is already contained we will not add
                                                // add only those charact that are not contained
                        // continue; take ! out and use continue statement
                       result += s;

                    }
        }
        System.out.println(result);// result is ab
    }
}
