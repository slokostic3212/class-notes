package day25_Practices;

import java.util.Arrays;

/*
6. write a program that can combine two arrays of integers and then print out the maximum number
 */
public class CombineTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5};

        int size = arr1.length + arr2.length;

        int[] arr3 = new int[size];//size is 5 and put 5 elements
       /* arr3[0] =arr1[0];
        arr3[1] =arr1[1];
        arr3[2] =arr1[2];

         arr3[3] =arr2[0];
        arr3[4] =arr2[1];

        */

        int index = 0;

        for (int each : arr1){
            arr3[index] = each;
            index += 1;
        }


       System.out.println(Arrays.toString(arr3));// to indess from Arrays.toString(arr3)
        Arrays.sort(arr3);

        for(int each : arr2){
            arr3[index] = each;
            index++;
        }
        System.out.println(Arrays.toString(arr3));
        System.out.println("Max: "+arr3[arr3.length-1]);
    }
}
