package day18_ForLoop;
/*3. write a program that can reverse the following string:
                String str = "Java";
                output: avaJ
            please provide two solutions:
                        first solution, you MUST use substring method
                        second solution, you MUST use charAt method
*/

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
      //  Scanner str = new Scanner(System.in);
       // String str = scan.next();

        String str = "Python";// to pytrhon
                    //avaJ ==> ava, 3

       String s1 = str.substring(1); //ava or

       // String s2 = str.substring(0, 1);// returns J
        char ch1 = str.charAt(0);
        String result1 = s1+ch1; //change s2 to ch1 still get ythonP

        System.out.println(result1);//ythonP
    }
}
