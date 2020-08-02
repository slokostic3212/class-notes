package Office_Hours.Practice_07_07_2020;

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine(); //"nalan";// should keep 1 a and 1 n == "nal"

        String result = "";// nal // for loop can give begining and end while loop can only give condtion
                            //any task done w for can be done with while

        for (int i = 0; i <= str.length()-1; i++) {// last index can never be 0 so ++  executed 5 x's

            String s = "" + str.charAt(i);// concate to "" + becuz it wont let string give string
            // s: n a l a n
         /*                                       // if n already in result - skip if not then add it
            if(result.contains(s)){
                continue;

            }else{
                result += s;              // did this to avoid dup  need to add this to result
            }

        */
            if (!result.contains(s)) {
                result += s;
            }


        }
        System.out.println(result);

    }
}
