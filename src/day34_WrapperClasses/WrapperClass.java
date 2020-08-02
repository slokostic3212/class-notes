package day34_WrapperClasses;

import java.util.Arrays;

public class WrapperClass {

    public static void main(String[] args) {

        // wrapper class only accepts its own ie Interger int Boolean boolean
        Integer num = 100;  // this Integer is a class devoted to integer primitive
        int a = 100;

        byte t = 100;
        int z = 100;
        //Integer z2 = t;

        Byte b1 = 50;
        int n1 = b1;

        byte b2 = 40;
      //  Integer n2 = b2; does not accept

        Integer n3 = new Integer(123);

        int[] arr = new int[3];// get 000 because size was given only your did not assign a value to arr

        double[] arr1 = new double[3];

        Integer [] arr3 = new Integer[3];



        System.out.println(Arrays.toString(arr));//000
        //System.out.println(Arrays.toString(arr1));//0.0 0.0  0.0
        //System.out.println(Arrays.toString(arr3));// null null null

        int p1 = 300;
        Integer p2 = p1; //  AUTOBOXING  == converting primitive values to wrapper class

        Integer q1 = 500;
        int q2 = q1; // UNBOXING  == converting wrapper class values to primitive

        Double r1 = 300.0;// must give decimal because wrapper class is dedicated to its primitive
        double r2 = r1; // unboxing

        long l1 = 400;
        Long l2 = l1;// autoboxing

        Float f1 = 100.5f; // neither auto nor unboxing
        Float f2 = f1;




     }

}
