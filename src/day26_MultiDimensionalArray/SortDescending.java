package day26_MultiDimensionalArray;

import java.util.Arrays;

/* 1. write a program that can sort the array in descending order
        ex:
            arr1: { 10, 11, 8, 9, 12, 5, 15};

            output:

                arr2: {15, 12, 11, 10, 9, 8, 5}

    NOTE: at the end, you must have have an array that contains the descending order of the original array

 */
public class SortDescending {
    public static void main(String[] args) {


        int[] arr = {2,1,3};//want to get 1 2 3
        Arrays.sort(arr);// arr 1 2 3
        System.out.println(Arrays.toString(arr));

        int[] desc = new int[arr.length];// use length method want 3 2 1
        desc[0] = arr[arr.length-1];// desc[0] = arr[2]
        desc[1] =  arr[1];          // desc[1] = arr[1]
        desc[desc.length-1] = arr[0];//desc[2] = arr[0]


           int k = 2;


           for (int i = 0; i <= desc.length-1; i++){//0 1 2
               desc[i] = arr[k];

               k--; // k 2 1 0

           }
        System.out.println(Arrays.toString(desc));// 000 cuz u did not tell it


        }
    }



