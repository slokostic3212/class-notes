package day25_Practices;

import java.util.Arrays;

public class Array_1_100 {
    public static void main(String[] args) {
        int[] numbers = new int[100];// size intialized but no values initialied == compiler gives 0
                                        // 0 is default value for intergers
                                    // strings default value = null
                                    // for decimals = 0.0
       // numbers[0] = 1;// to assign index to numbers
       // numbers[1] = 2;// can declare a loop to assign

        for (int i = 0; i <= numbers.length-1; i++){
            numbers[i] = i+1; // this one loop passes index and value

        }

        System.out.println(Arrays.toString(numbers));// result = 100 0's

        for(int each : numbers ) {// for each loop depends on length
            if (each % 2 !=0){// chg ot == to get odd numbers

                continue;
            }
            System.out.print(each+" ");
        }
    }
}
