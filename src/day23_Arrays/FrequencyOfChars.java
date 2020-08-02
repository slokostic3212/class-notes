package day23_Arrays;
/*
3. write a program that can return the frequency of every single characters from the string:
            ex:
                str1 = "aabbccaa";
                output: a4b2c2

                HINT:
                    easier approach:
                            1. remove duplicates ==> str2 = "abc"
                            2. then find each of str2' character' frequency in str1 ==> 4, 2, 2
                            3. result: a4b2c2

                        previous section we leaned how to find the frequency of one character. you will need to repeat the same step
INTERVIEW QUESTION

 */

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class FrequencyOfChars {
    public static void main(String[] args) {

      /*  String str = "ABAB"; // result u want A2B2
        String nonDup = ""; // "AB" only char == remove dups from originalstring and get this"
        // result after dup removing
        // 1st A chgs to AB after 2nd
        String result = ""; // A2B2 result at the end

        for (int i = 0; i <= str.length() - 1; i++) {// removing dups here and concating in string
            String ch = "" + str.charAt(i);// A, B, A, B

            if (!nonDup.contains(ch)) {
                nonDup += ch;

            }

        }
        System.out.println(nonDup);

        // AB - string wo dup
        // abab - string w dup
        // how much freq from original str use charAt method to get Afrom string

        for (int j = 0; j < +nonDup.length() - 1; j++) {// j is the index number of nonDup string below this linet

            char ch = nonDup.charAt(0); //A // to find b need to chag 0 to 1 and ch need to chg to ch2
            int count = 0;// to 2 to find b
            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == ch) {
                    count += 1;// chg to 2 to find b

        /*char ch = nonDup.charAt(0); //A // to find b need to chag 0 to 1 and ch need to chg to ch2
            int count = 0;// to 2 to find b
            for(int i = 0; i <= str.length()-1; i++){
                if (str.charAt(i) == ch){
                    count +=1;// chg to 2 to find b

         */
     /*           }
            }
            result += "" + nonDup.charAt(0) + count;//+ to a char give addition  so concat here

            System.out.println(result);

    }

    }
*/

        String str = "BBCCDD";
        String nonDup = "";   // BCD

        // for (int i = 0; i < str.length() - 1; i++) {
        // String ch = "" + str.charAt(i); /// B B C C D D

        // if(nonDup.contains(ch)){
        //    continue;

        // }else{
        //    nonDup += ch;
        //  }
        // }
        //System.out.println(nonDup);// result is BCD

        String exprectedResult = "";   // B2C2D2
        // str   "BBCCDD"   nonDup = "BCD"  ===> "B2C2D2"

        for (int j = 0; j <= nonDup.length()-1; j++) {// removes dup



            char ch1 = nonDup.charAt(j); // B ch g toj
            int count1 = 0;// 1+1 =2

            for (int i = 0; i <= str.length() - 1; i++) {// returns frequency each ch from string str
                if (str.charAt(i) == ch1) {
                    count1++;
                }
            }
            exprectedResult += "" + ch1 + count1;

            char ch2 = nonDup.charAt(1);//C
            int count2 = 0;

            for (int i = 0; i <= str.length() - 1; i++) {
                count2++;
            }

            System.out.println(exprectedResult);
        }
    }

}