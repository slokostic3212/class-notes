package day23_Arrays;
/*
int[] arr = {10,20, 3,4,5,6,7,-10,-100, 300, 400};
write a program that can return the min and maximum number from the array
*/


public class MaxMin {
    public static void main(String[] args) {
        int [] arr = {5, 5, 6, 3, 4, 1};// chg 4 to 6
        int max = arr[0];//5 max element
        int min = arr[0];// 5 is min element now is 4 <5 yes now 4 is 6 < 4 no

        for (int i = 1; i <= arr.length-1; i++){// 1 2 3 4 5

            if (arr[i] > max){// compare arrays elements and assigns the max numb to variable max
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];//
            }
        }
        System.out.println("max number: "+max);// get 5 then chg to 6 then max result is 6
        System.out.println("min number: "+min);
    }
}
