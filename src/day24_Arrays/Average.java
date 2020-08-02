package day24_Arrays;
/*
 3. Write a program that can return the average number from an array of integers

            ex: [1,2,3]
            average: 2
            [10, 15, 5, 6]
            average: 9
            [4, 5, 6, 7, 8, 10, 20, 30, 0]
            average: 10
 */

public class Average {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};// need to iterate regardless of sz - use for loop
        //           0 1 2 3 4 5 6 7 8 9

        int sum = 0;

        for (int i = arr.length-1; i>=0; i--) {            // use dec because it will jump to index 10

            sum += arr[i];
        }
        double average =  sum / (double)arr.length;// apply casting to get 5.0

        // double d1 = 10

        System.out.println("Average number: "+average);//

        double d1 = 10/3; // 3 ==> 3.0

        System.out.println(d1);

        double d2 = 10/3.0; //3.33

        System.out.println(d2);

    }
}
