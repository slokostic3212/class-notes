package day24_Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,-1,-2,-3};
        for(int i = 0; i <= arr.length-1; i++){// i = 0 is the index number
            System.out.print(arr[i] +" ");// to print each elemtn w space 1 2 3 4 5 6 7 8 9 -1 -2 -3
        }
        System.out.println();
        System.out.println("==============================");

        for(int each : arr ){// each = element in arr data structure
            System.out.print(each+ " "); // 1 2 3 4 5 6 7 8 9 -1 -2 -3

        }
        System.out.println();
        System.out.println("=====================");

        String[] arr1 = {"Adam", "Paola", "Slo","Tural" };
        for (String each : arr1 ){
            System.out.print(each+ " ");//Adam Paola Slo Tural
        }

    }
}
