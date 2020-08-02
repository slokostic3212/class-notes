package day19_ForLoop;
/* write a program that can reverse any string
*/

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
       // String str = "Cyber";// "rebyC"
        //              0123
       // String result = "" +str.charAt( str.length()-1 ) + str.charAt(3)+ str.charAt(2)
              //  + str.charAt(1)+ str.charAt(0);  use loop method

        String result = "";// r e b y C

        for (int i = str.length()-1; i >= 0; i--){//i: 4 3 2 1 0    use str.length() -1 if index number is not known
            result+= str.charAt(i);//+= method added to string does a concat
        }

        System.out.println(result); // jsut this string no other string what if u dont know index -  use str.length() -1
                                        // get same result rebyC

    }


}
