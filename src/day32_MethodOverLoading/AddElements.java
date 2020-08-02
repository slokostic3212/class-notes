package day32_MethodOverLoading;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class AddElements {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int num = 10;// chgto 10 from 4

        // {1, 2, 3, 4};
        int i = 0;
        int[] arr2 = new int[arr.length + 1];//chg from 3 index above to lentth cuz u may not know size
        arr2[arr2.length-1] = num;//num = element assigned to position of array to the lft of = sign

        for (int each : arr) {
            arr2[i] = each;

            i++;
        }
        System.out.println(Arrays.toString(arr2));

        System.out.println("====================================");

        int[] scores = {85, 65, 45, 55, 95};
        int n1 = 87;

             scores = addElement(scores, n1);

            Arrays.sort(scores);// [45, 55, 65, 85, 87, 95]

        System.out.println(Arrays.toString(scores));// before sorting [85, 65, 45, 55, 95, 87]
    }
    public static int[] addElement(int[] arr, int num){
        int i = 0;
        int[] arr2 = new int[arr.length + 1];//chg from 3 index above to lentth cuz u may not know size
        arr2[arr2.length-1] = num;//num = element assigned to position of array to the lft of = sign

        for (int each : arr) {
            arr2[i] = each;

            i++;
        }
        return arr2;

    }
}
