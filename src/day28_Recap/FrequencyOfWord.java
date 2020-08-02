package day28_Recap;
/* 1. write a program return the frequency of a word from a string
            ex:
                str = "JavajavaJAVA";
                word = "java";
                output:
                    3

        do not use same the approach we did in last office hour
*/
public class FrequencyOfWord{
    public static void main(String[] args) {

        String str = "javajava";// chg to 5 java then chg to
        //            01234567
        //substring)0, 4) ==> java  when i is 0 +4 = 4 and so forth
        //substring(1, 5) ==> avaj
        //substring (2, 6) ==> vaja
        //substring(3, 7) ==> ajav
        //substring (4, 8) == > java // out of bound 8 is excluded  need to make max value of 4

        // to get above info == substring(1, i+4)

        // "java" how many in string - 4 char in java -
        //word has 4 char need to compare these char w other char in string

        int count = 0;
        for (int i = 0; i <=str.length()-4; i++){// i: index 0 1 2 3 4 5 6 7
            // chg -1 to -4 to make sure you get max value of 4
            // chg to -1 max value is 0 1 2 3 4 5 6 7
            String s = str.substring(i, i+4);// then here index cg to 9 get out of bound
            // so if u add 4 here makes sure to -4 in str.length
            if(s.equalsIgnoreCase("java")){//to ignore case sensitivity
                count++;
            }



        }
        System.out.println(count);// 2 java in this string // chg to 5 java in string
    }
}


