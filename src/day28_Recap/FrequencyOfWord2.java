package day28_Recap;

import java.util.Scanner;

public class FrequencyOfWord2{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();// "pythonpythoncatcatcat";//catcatcatdogdog chg yo
        //(0 ,3)
        String word = scan.next();
        int l = word.length();

        int count = 0; // "cat' inc count by 1 each time its true
        for (int i = 0; i <= str.length()-3; i++){// for chg to pythong
                                    //chg -3 to length of word for scan.net
            // chg to str.legnth() -l
            // String s = str.substring(i, i+3); // add 3 here and subtr 3 in str.length

            if (str.substring(i, i+3).equalsIgnoreCase("cat")){//chg to dog to see fre of dog chg to python
                count++;// add 1 each time string is true
                                            // now chg cat to word because it was given
                                            // chg to leght method
                //                          // chg to i+3 to i <= str.length() -l
            }

        }
        System.out.println(count);// see freq of cat = 3 2 for python
    }
}

