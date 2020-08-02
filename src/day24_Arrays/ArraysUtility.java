package day24_Arrays;
import java.util.Arrays;
// import java.util.*;this give everything
public class ArraysUtility {
    public static void main(String[] args) {

        int[] arr = {1,2,3};// must convert to string will get hastag error

        System.out.println(arr);

        System.out.println(    Arrays.toString(arr)  );//will get {1,2,3}

        String s1 = Arrays.toString(arr);// can chg to variable
        System.out.println(s1);// get {1,2,3}

        String[] names = {"Muhtar", "Saim", "Nadir", "Asiya", "Kuzzat"};

        System.out.println(names);// in order to print an array variable MUST convert to a string

        System.out.println(   Arrays.toString(names));// now will get {"Muhtar", "Saim", "Nadir", "Asiya", "Kuzzat"};

        System.out.println("==============================================");

        int[] nums = {5,4,6,5,4,3,10};
        Arrays.sort(nums);// in ascending order 3 4 4 5 5 6 10

        System.out.println(  Arrays.toString(nums));//result {3, 4, 4, 5, 5, 6, 10}

        System.out.println("Maximum nimber: "+ nums[nums.length-1] );// need to sort first to get max number otherswise
                                                                // 4 would be the max num since its the last index num

        System.out.println("Minimum number: "+nums[0]);// result 3

        String students[] = {"Mehdi", "Elkem", "Meee", "Trump"};
        // elk mee meh tru

        Arrays.sort(students);
        System.out.println(  Arrays.toString(students));//[Elkem, Meee, Mehdi, Trump]

        System.out.println("================================");

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};

        boolean r1 = Arrays.equals(arr1, arr2);
        System.out.println(r1);// chks index by index == true

        int[] arr3 = { 2,1,3};//in diff index order

        Arrays.sort(arr2); // arr2  1 2 3
        Arrays.sort(arr3);// arr3 1 2 3

        boolean r2 = Arrays.equals(arr2, arr3);
        System.out.println(r2);// false chgs to true once sorted

        int[] arr4 = {1,2,3,4,};
        int[] arr5 = {1,2,3};

        boolean r3 = Arrays.equals(arr4, arr5);
        System.out.println(r3);//false not sorted here





    }


}
