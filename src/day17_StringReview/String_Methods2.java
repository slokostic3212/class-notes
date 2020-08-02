package day17_StringReview;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;
import netscape.javascript.JSUtil;

public class String_Methods2 {
    public static void main(String[] args) {

        String s1 = "Cat";
        String s2 = new String("Cat");// false because memory location is different in heap
        String s3 = new String("Cat");
        // equals method
        System.out.println(s1 == s2);//false

        System.out.println(s1.equals(s2));//true

        System.out.println(s2 == s3);//false

        System.out.println(s2.equals(s3));//true

        String s4 = "java";
        String s5 = "Java";
        System.out.println(s4.equals(s5));//false
        System.out.println(s4 == s5);// false

        System.out.println(s4.equalsIgnoreCase(s5));// truestring
        String s6 = "MuHtAr";
        String s7 = "muhtar";

        System.out.println(s6.equalsIgnoreCase(s7));// true
        System.out.println(s6.equals(s7));// false

        // isEmty == chkecks if the length of string is 0

        String str = "";
        System.out.println(str.isEmpty());//false

        str = str.trim(); // cannot modify original object

        System.out.println(str.isEmpty());//refs old object needd to be assigned // get true

        String str2 = "Cybertek";
        System.out.println(str2.isEmpty());// false because string is not empty

        str2 = "";
        System.out.println(str.isEmpty());// true because length is 0


        // contains: included or not

        String str3 = "Java, C#, Python, Ruby, C++";
        System.out.println(str3.contains("Java"));// true
        System.out.println(str3.contains("java"));// false cuz case sensitive

        //System.out.println( str.toLowerCase().contains("java"));//true for knowledge only

        String str4 = "ABCD";
        System.out.println(str4.contains("D"));//true because D is in string regardless of locrtion

        // startsWith & endsWith()

        String str5 = "Cybertek";
        System.out.println(str5.startsWith("Cyber"));// true ifhave C also true
        System.out.println(str5.startsWith("ABC"));// false
        System.out.println(str5.startsWith("E") || str5.startsWith("C"));
        //                          false       || true ==> true
        System.out.println(str5.startsWith("CybABC"));// false

        String str6 = "Today is a great day";

        System.out.println(str6.endsWith("day")); //tue
        System.out.println(str6.endsWith("great"));//false

    }

}