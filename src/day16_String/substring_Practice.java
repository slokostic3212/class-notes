package day16_String;
/*ask user to enter two words

	print first word wo its first charact and then print the second wo its
	first charact

		input:
			apple
			banana

		output:
		 	ppleanana

 */

import java.util.Scanner;

public class substring_Practice {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
/*
        String word = scan.next();


        System.out.println("Enter your first word");
        String str1 =  scan.next();//Apple use str because will need a substring starting from index 1

        System.out.println("Enter your second word");
        String str2 =  scan.next();//Banana substring from index 1

        // end prod needs tobe ppleanana
        String result = str1.substring(1).concat(str2.substring(1) );
        String result = str1.substring(1) + str2.substring(1);// second ex of concat

        System.out.println(result); // prints out ppleanana
    }

}
*/
    //extra task

        String str = "I like to drink Pepsi";// p is index 16
        String drink = str.substring(16);
        System.out.println(drink);// gives pepsi

        String action = str.substring(10, 14 +1);//+1to include ending index = k
        System.out.println(action);//drink


        System.out.println("Enter your first word");
        String str1 =  scan.next();//Apple

        System.out.println("Enter your second word");
        String str2 =  scan.next();//Banana

        // end prod needs tobe ppleanana
        //String result = str1.substring(1).concat(str2.substring(1) );
            String result = str1.substring(1) + str2.substring(1);// get same result
        System.out.println(result);
    }

}
