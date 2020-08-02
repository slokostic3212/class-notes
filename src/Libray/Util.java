package Libray;

import java.util.Arrays;

public class Util {
    // import Library.Util;

    public static String removeDup(String str) {
        String nonDup = "";
        // removes the dups and returns the value string

        for (String each : str.split("")) {
            if (!nonDup.contains(each)) {
                nonDup += each;
            }
        }

        return nonDup;
    }
    // removes the dups and returns the value string

    public static String reverse(String str) {
        // reverse the string and return the value

        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
    // reverse the string and return the value

    public static int frequency(String str, char ch) {
        // finds the frequency of char from string str and returns as int

        int count = 0;
        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }
        }

        return count;
    }
    // finds the frequency of char from string str and returns as int

    public static String uniques(String str) {
        // returns the uniques from the string

        String uniques = "";

        for (char each : str.toCharArray()) {
            int count = frequency(str, each);  // frequency of every character
            if (count == 1) {
                uniques += each;
            }
        }

        return uniques;
    }
    // returns the uniques from the string

    public static String frequencyOfChars(String str) {
        // returns the frequency of every single characters from a string

        String expectedResult = "";
        String nonDup = Util.removeDup(str);

        for (char each : nonDup.toCharArray()) {
            int count1 = Util.frequency(str, each);
            expectedResult += "" + each + count1;
        }

        return expectedResult;
    }
    // returns the frequency of every single characters from a string

    public static String formatFullName(String first, String last) {
        // formats the full name

        first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
        last = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();
        String fullName = first + " " + last;

        return fullName;
    }
    // formats the full name

    public static int maxNum(int [] arr) {
        // finds and returns the max num from an array

        int max = arr[0];

        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }
    // finds and returns the max num from an array


    public static Integer maxNum(Integer[] arr) {
        // finds and returns the max num from an Integer array

        Integer max = arr[0];

        for (Integer each : arr) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }
    // finds and returns the max num from an Integerb array

    public static double maxNum(double [] arr) {
        // finds and returns the max num from an double array

        double max = arr[0];

        for (double each : arr) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }
    // finds and returns the max num from a double array


    public static int minNum(int[] arr) {
        // finds and returns the min num from an array

        int min = arr[0];

        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }

        return min;
    }
    // finds and returns the min num from an array

    public static int[] combine2Arrays(int[] arr1, int[] arr2) {
        // combines 2 arrays and returns it

        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (int each : arr2) {
            arr3[i] = each;
            i++;
        }

        return arr3;
    }
    // combines 2 arrays and returns it

    public static int[] addElement(int[] arr, int num) {
        // inserts the element to the array

        int i = 0;
        int[] arr2 = new int[arr.length + 1];//chg from 3 index above to lentth cuz u may not know size
        arr2[arr2.length - 1] = num;//num = element assigned to position of array to the lft of = sign

        for (int each : arr) {
            arr2[i] = each;

            i++;
        }
        return arr2;

    }
    // inserts the element to the array


    /*
    double, Double, Integer, char, Character, String array

     */

    public static int[] sortDesc(int[] arr) {
        // sorts int array in descending order and returns it
        Arrays.sort(arr);

        int[] arr2 = new int[arr.length];  //{5,4,3,2,1};

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;
        }

        return arr2;
    }
    // sorts int array in descending order and returns it

    public static double[] sortDesc(double[] arr) {
        // sorts double array in desc order and returns it
        Arrays.sort(arr);

        double[] arr2 = new double[arr.length];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;
        }

        return arr2;

    }
    // sorts double array in desc order and returns it

    public static char[] sortDesc(char[] arr) {
        //sorts char array in desc order and returns it
        Arrays.sort(arr);

        char[] arr2 = new char[arr.length];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;
        }

        return arr2;

    }
    //sorts char array in desc order and returns it

    public static Integer[] sortDesc(Integer[] arr) {
        // sorts string array ain desc order and returns it
        Arrays.sort(arr);

        Integer[] arr2 = new Integer[arr.length];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;
        }

        return arr2;
    }
    // sorts string array ain desc order and returns it

    public static Double[]  sortDesc(Double[] arr){
    //sorts Double array in descending order
        Arrays.sort(arr);

        Double[] arr2 = new Double[arr.length];  //{5,4,3,2,1};

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;
    }
    //sorts Double array in descending order

    public static Character[]  sortDesc(Character[] arr){
    //sorts Character array in descending order
        Arrays.sort(arr);

        Character[] arr2 = new Character[arr.length];  //{5,4,3,2,1};

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;
    }
    //sorts Character array in descending order

    public static String[] combine2Arrays(String[] arr1, String[] arr2){
        // combines two array and returns it
        String[] arr3 = new String[arr1.length + arr2.length];

        int i = 0;
        for(String each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(String each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }
    // combines two array and returns it

    public static double[] combine2Arrays(double[] arr1, double[] arr2){
    // combines two array and returns it
        double[] arr3 = new double[arr1.length + arr2.length];

        int i = 0;
        for(double each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(double each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }
    // combines two array and returns it

    public static char[] combine2Arrays(char[] arr1, char[] arr2){
        // combines two array and returns it
        char[] arr3 = new char[arr1.length + arr2.length];

        int i = 0;
        for(char each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(char each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }
    // combines two array and returns it

    public static Integer[] combine2Arrays(Integer[] arr1, Integer[] arr2){
        // combines two array and returns it
        Integer[] arr3 = new Integer[arr1.length + arr2.length];

        int i = 0;
        for(Integer each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(Integer each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }
    // combines two array and returns it

    public static Double[] combine2Arrays(Double[] arr1, Double[] arr2){
        // combines two array and returns it
        Double[] arr3 = new Double[arr1.length + arr2.length];

        int i = 0;
        for(Double each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(Double each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }
    // combines two array and returns it

    public static Character[] combine2Arrays(Character[] arr1, Character[] arr2){
        // combines two array and returns it
        Character[] arr3 = new Character[arr1.length + arr2.length];

        int i = 0;
        for(Character each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(Character each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }
    // combines two array and returns it





}







