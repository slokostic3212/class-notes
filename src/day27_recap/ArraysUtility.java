package day27_recap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class ArraysUtility {
    /*
    sort(): sorts in smallest to greatest
    toString():
    equals():
     */
    public static void main(String[] args) {

        String[] names = {"odina", "lilia", "berk", "emine"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        int[] score = {80, 75, 65, 110, 90, 45, 56, 78};

        Arrays.sort(score);
        System.out.println(Arrays.toString(score));

        System.out.println("Maximum: "+ score[score.length-1]);//to get last index number max is last index number
        System.out.println("Minimum: "+score[0]);

        //equals

        System.out.println("=====================================================");

        String[] s1 = {"A", "B", "C"};
        String[] s2 = {"A", "B", "C"};

        System.out.println(         Arrays.equals(s1,s2)     );// ckx incx by index

        String[] s3 = {"C", "B", "S"};
        System.out.println(Arrays.equals(s1, s3));

        String[] a1 = {"A", "B", "C"};
        String[] a2 = {"B", "a", "C"};

        Arrays.sort(a1);//{"A", "B", "C"};
        Arrays.sort(a2);//{"A", "B", "C"};

        System.out.println(Arrays.equals(a1,a2));


    }

}
