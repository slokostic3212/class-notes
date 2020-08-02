package day16_String;

import java.util.Scanner;

public class equalWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
        String first = scan.next();

        System.out.println("Enter your second workd");
        String second = scan.next();

       /* if (first.equals(second)){
            System.out.println("They are equal");
        }
*/
        String result = (first.equalsIgnoreCase(second)) ? "Equal" : "Not equal";// java vs Java use ignor method and
                                                                            // now equal
                                                        // to chk string equallty use .equals not ==
        System.out.println(result);
    }
}
