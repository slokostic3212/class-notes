package day24_Arrays;

import java.util.Scanner;

/*
2. write a program that asks user how many
numbers he wants to enter, and get all the user inputs and store them
into an array variable, and then write the program that can return maximum and minimum numbers
 */
public class MaxMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter");
        int n = scan.nextInt();// if array size if 10 then n needs to be intialized to 10

        int[] arr = new int[n];// [ 1 2 3

        for (int i = 0; i < n; i++) {// can use <= n-1 same thing // i<n represents each of num of array
                                    // getting user input and storing in array is being done here
            System.out.println("Enter a number");
            int num = scan.nextInt();//how do we make sure the nextInt nmber is same as index of arr
                // num 10   20  30
                //index 0   1   2
            arr[i]=num;
            // i vlaue 0 1 2 3 4
            // indes   1 2 3 4  5
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i <= arr.length-1; i++){ // max numb not imp becuz these loops will iterate all unbers
                                        // more numbs more executions

            //System.out.println(arr[i]+" ");// put in 5 and enter 12345 notprinting for max example

            if (arr[i] > max ){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[1];
            }
        }
        System.out.println("Maximum number: "+max);// entered 5 numbers and got 9 as max

    }

}
