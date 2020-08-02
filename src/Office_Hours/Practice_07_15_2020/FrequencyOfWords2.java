package Office_Hours.Practice_07_15_2020;

import java.util.Scanner;

public class FrequencyOfWords2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine().toLowerCase();
        //String str = "JavajavaJavajavaJAVA".toLowerCase();//can put .toLowerCase here
        //str = str.toLowerCase();//javajavajavajavajava
                                  // str = javajavajavajava
                                  // str =  javajavajava
                                  // str =  javajava
                                  // str = java
                                  // str = ""

        int count= 0;// 1 + 1 + 1 + 1
        while (str.contains("java")){     // this is the if state that needs to be repeated each time so use while loop
                                        // while loop is a repeated if statement so chg to while from if

                            // true true true true true false when "" is last
            count++;
            str = str.replaceFirst("java", "");// removes 1 java from string
        }

        System.out.println(count);
    }
}
