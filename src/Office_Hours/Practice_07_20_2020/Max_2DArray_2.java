package Office_Hours.Practice_07_20_2020;

import java.util.Arrays;

public class Max_2DArray_2 {

    public static void main(String[] args) {
            //             0  1  2     0  1  2  3     0  1   2   3  4      0    1   2  3   4   5
        int[][] arr2D = { {1, 2, 3} , {4, 5, 6, 7} , {8, 9, 10, 11, 12} , {13, 14, 15, 20, 16, 17, 17000 } };
        //                0             1               2                               3
        int max = arr2D[0][0];

        for( int[] each1D : arr2D){// to get each 1D array
            //System.out.println(Arrays.toString(each1D));// outer loop prints each indiv array

            for( int eachNum : each1D ){ // inner loop gets each element

                if(eachNum > max){
                    max = eachNum;
                }
            }
        }
        System.out.println("Maximum: "+max);


    }
}
