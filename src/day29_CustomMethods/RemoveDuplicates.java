package day29_CustomMethods;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class RemoveDuplicates {
    //10. write a method that can remove the duplicates from the string
    //  "abababa
    //  "ab"

    public static void main(String[] args) {
        String str =  "aaaabababababbabaaaaaaaacccddeeee";

        removeDup(str);
    }


    public static void removeDup(String str) {//"abab"

        String nonDup = "";// add to this string - a b

                            // a, b, a, b
        for (String each : str.split("")) {


            if (!nonDup.contains(each)) {
                nonDup += each;
            }
        }

        System.out.println(nonDup);
    }


}
