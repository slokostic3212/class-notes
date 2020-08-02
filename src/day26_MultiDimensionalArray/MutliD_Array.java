package day26_MultiDimensionalArray;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class MutliD_Array {
    public static void main(String[] args) {
        char[] ch1 = {'A', 'B'};
        char[] ch2 = {'C', 'D', 'E'};
        char[] ch3 = {'F', 'G','H'};// all of these are single dimen arrays
                                    // need to use x dimen


        //                     0    1      0    1    2      0    1   2
        char [][]  ch2D = {  {'A', 'B'}, {'C', 'D', 'E'}, {'F', 'G','H'}  }; // can also use ch1 ch2 ch3
        //                       0              1               2

        System.out.println(Arrays.toString(  ch2D[1]) );// [CDE] prints ut

        System.out.println(    Arrays.toString(  ch2D[2]   ));// prints out {FGH]

        //H
        //ch2D[2][2] // returns an element dont need arrays to string method

        System.out.println( ch2D[2][2]); // H

        // C
        System.out.println( ch2D[1][0]);// C D E to get index number of element - the 2nd [] does it to get c out

        // G B
        System.out.println( ch2D[2][1]+"  "+ ch2D[0][1]);

        System.out.println("=============================================================");

        // {1, 2,3}, {4}, {5, 6}, {7, 8, 9, 10} 1D array can only hold elements = int[] arr1D

        //                0  1  2    0    1  2    0  1  2   3
        int[][] nums = { {1, 2, 3}, {4}, {5, 6}, {7, 8, 9, 10} };
        //                  0        1      2           3

        // {7, 8, 9, 10}
        System.out.println(Arrays.toString(nums[3]));//{7, 8, 9, 10}

        // {7, 8, 9, 10}
        //{5, 6}
        //{4}
        //{1, 2, 3}

        for (int i = 0; i <= nums.length-1; i++){
            System.out.println( Arrays.toString(nums[i]) );// get nuss 1-10

            System.out.println(Arrays.deepToString(nums));
        }

    }
}
