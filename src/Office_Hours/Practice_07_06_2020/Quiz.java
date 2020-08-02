package Office_Hours.Practice_07_06_2020;

public class Quiz {

    public static void main(String[] args) {
        String str = " ";
            str = str.trim();
        System.out.println(str.isEmpty());


        System.out.println("====================================");
        String ta = "Ab";
        ta = ta.concat("B "); // A B
        String tb = "C ";
        ta = ta.replace('C', 'D' ); // A B D

        ta = ta + tb; // A B CC

        System.out.println(ta);

        System.out.println("=========================");
        String s1 = "abc";
        String s2 = "abc";

        System.out.println( "s1 == s2 is: " + s1 == s2);
        //                   s1 == s2  abc  == abc
        //                       false

        System.out.println("======================================");


    }

}
