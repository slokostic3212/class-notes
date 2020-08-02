package day24_Arrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

//harder version of uniques
public class Uniques2 {
    public static void main(String[] args) {

        String str = "aabcc";
        String expectedResult = ""; // looking for frequency of char

        for (int j = 0; j <= str.length() - 1; j++) {// need frq of every single characters

            char ch1 = str.charAt(j);// a chg 0 to 1 2 and so forth to find freq of every char SO USE
            // A NESTED LOOP for beg to end char // chg 0 to j
            // compare ch1 with every char in char in string
            int count1 = 0;// 1+1 so goes to b and not equal to a and so forth   chgto count1 finds freq of char after 1

            for (int i = 0; i <= str.length() - 1; i++) {// used for finding frqcy of char and assign to count
                char each = str.charAt(i);// each is each char in string when ch1 matches each then it tells
                // frequ of charac in string


                if (ch1 == each) {
                    count1 += 1;

       /* char ch1 = str.charAt(0);// a chg 0 to 1 2 and so forth to find freq of every char SO USE
                                            // A NESTED LOOP for beg to end char
                // compare ch1 with every char in char in string
        int count1 = 0;// 1+1 so goes to b and not equal to a and so forth   chgto count1 finds freq of char after 1

        for (int i = 0; i <= str.length()-1; i++){// used for finding frqcy of char and assign to count
            char each = str.charAt(i);// each is each char in string when ch1 matches each then it tells
                                        // frequ of charac in string


                if(ch1 == each){
                    count1+=1;
*/

                }

            }
            if (count1 == 1) {
                expectedResult += ch1;
            }
            System.out.println(expectedResult);// result is // chg to expectedResult from count1 get b when 0 chgs to j
        }


    }
}
