package day24_Arrays;

import com.sun.scenario.animation.shared.ClipEnvelope;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3};// 2 is unigque cuz it occurs only once

        for (int j = 0; j <= arr.length-1; j++) {
            int num1 = arr[j];//1   THIS IS TO FIND IF FIRST IS UNIQUE NTO THE REST == 0 CHGS TO THE ELEMTENT
            System.out.println(num1);
        }
    }
}