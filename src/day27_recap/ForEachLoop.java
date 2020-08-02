package day27_recap;

import java.util.function.DoubleToIntFunction;

public class ForEachLoop {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        //            0   1   2   3   4 index number
        for(int i = 0; i <= arr.length-1; i++){
            System.out.print(arr[i]+ " ");//1 2 3 4 5
        }

        System.out.println();
        System.out.println("================================");

        for(int each : arr){//each = element not index number
            System.out.print(each+ " ");// 1 2 3 4 5
        }
        System.out.println();
        System.out.println("====================================");

        for(int i = arr.length-1; i>=0; i--){//reverse number chg to 50 40 30 20 10
            System.out.print(arr[i]+ " ");//1 2 3 4 5

        }
        System.out.println();
        System.out.println("===================================");

        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 99};
        int countDivisibleBy3 = 0;
        for( int each : scores){
            if( each%3 != 0){
                continue;
            }
            countDivisibleBy3++;
            System.out.print(each+ " ");
        }
        System.out.println();
        System.out.println(countDivisibleBy3);


        System.out.println("===================================");
        String[] names = {"AB", "ABC","A", "AB", "ABCD" };

        for( String each : names){
            if (!each.contains("C")){
                continue;
            }
            System.out.print(each+ " ");// prints only that w C
        }
        System.out.println();
        System.out.println("=============================");

        //find min max from array

        int[] score = {80, 75, 65, 110, 90, 45, 56, 78};

        int max = score[0];
        int min = score[0];

        for( int each : score){
            if (each > max ){
                max = each;
            }
            if(each< min){
                min = each;
            }
        }
        System.out.println("Max number: "+max);
        System.out.println("Min number: "+min);
    }
}
