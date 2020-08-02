package day28_Recap;

import java.util.Arrays;

public class MultiD_Array {
    public static void main(String[] args) {
        int[] arr1D = {1, 2, 3, 4};

        //                 0  1  2      0  1  2  3  4     0   1   2  3   4
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13}};
        //                       0               1                array index

        System.out.println(Arrays.toString(arr2D[1])); // single dimen array [4, 5, 6, 7, 8]

        System.out.println(Arrays.deepToString(arr2D));// [1, 2, 3], [[4, 5, 6, 7, 8], [9, 10, 11, 12, 13]]

        //7
        System.out.println(arr2D[1][3]);   // element 7 is in array 1[4, 5, 6, 7, 8]

        System.out.println("=======================================");

        for (int i = 0; i <= arr2D.length-1; i++) {// gets each 1darr frol 1 wd
            int[] each1DArray = arr2D[i]; // will ret each int type array
            // System.out.println( Arrays.toString(each1DArray ));   // this outer loop itrates each 1d array
            // from 2d array
            for (int j = 0; j <= each1DArray.length - 1; j++) {
                int eachNum = each1DArray[j];                  // this inner loop is for iterating elements
                if (eachNum % 2 == 0) {                           // 1d

                }
                System.out.println(eachNum + " ");
            }
            System.out.println();

            System.out.println("======================================================");

            for (int[] each1D : arr2D) {// each will be assigne dto each1d
                                        // each1D variable declared win this loop cant go outside

                for ( int eachElement  : each1D){
                    if (eachElement % 2 != 0){
                        System.out.print(eachElement+" ");// yes it did
                    }

                }
                System.out.println();//
            }

        }
    }
}