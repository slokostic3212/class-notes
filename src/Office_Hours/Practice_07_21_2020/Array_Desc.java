package Office_Hours.Practice_07_21_2020;

import java.util.Arrays;

public class Array_Desc {

    public static void main(String[] args) {
        int[] arr = {98, 97, 100, 200, 55, 68, 78};

        Arrays.sort(arr); // [55, 68, 78, 97, 98, 100, 200]

        System.out.println(Arrays.toString(arr));

        int[] descArr = new int[arr.length];
 /*
        //      k        i
        descArr[0] = arr[6];
        descArr[1] = arr[5];
        descArr[2] = arr[4];
        descArr[3] = arr[3];
        descArr[4] = arr[2];
        descArr[5] = arr[1];
        descArr[6] = arr[0];// this works if arr has exactly 7 elements - better to use a loop method
*/
        int k = 0;// this is the index of descArr the i is for orig arr

        for (int i = arr.length-1; i >= 0; i --){// chg 6 to whateer the last index number is or use arr.length-1
            descArr[k] = arr[i];// this does the same thing as the batch above

            k++;
        }

        System.out.println( Arrays.toString(descArr));// get 7 0's cuz u havenet given any elements
                                        // now get becuz of the loop above



    }
}
