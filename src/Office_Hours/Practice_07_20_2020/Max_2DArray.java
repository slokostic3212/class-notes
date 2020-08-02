package Office_Hours.Practice_07_20_2020;

public class Max_2DArray {
    //write a program that can find the maximum number from any given two dimensional arra

    public static void main(String[] args) {
            //             0  1  2     0  1  2  3     0  1   2   3  4
        int[][] arr2D = { {1, 2, 3} , {4, 5, 6, 7} , {8, 9, 10, 11, 12} , {13, 14, 15, 20, 16, 17,  } };
            //                0             1               2  to get {123} from variable arr2D

           int max = arr2D[0][0];   //int max = eachArray[0];//chg to arr2D[0][0]

            for(int j =0; j <= arr2D.length-1; j++){// THIS HERE LOOKS FOR ALL ARRAYS
                int[] eachArray =  arr2D[j]; // changes [0] to 1 or 2 for each array
                                // BUT WHEN PLACE HERE USE [J] CUZ IT REPS INDEX NUMB OF ARRAYS

                for (int i = 0; i <= eachArray.length-1; i++){  // get access to each num in each array
                                            // I = INDEX NUMBER OF ELEMENTS
                    int eachNum = eachArray[i];
                    if (eachNum> max ){
                        max = eachNum;
                    }
                }

            }

 /*          int[] eachArray =  arr2D[0]; // changes [0] to 1 or 2 for each array

           for (int i = 0; i <= eachArray.length-1; i++){  // get access to each num in each array
               int eachNum = eachArray[i];
               if (eachNum> max ){
                   max = eachNum;
               }
           }
*/
            System.out.println("Maximum: "+max);// finds max num from first array max is 3 need to repeat above 3x
                                                    // to get max num from each array
                                                    // now 20 is max when code got bumped up to j status
    }


}
