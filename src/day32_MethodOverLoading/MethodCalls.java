package day32_MethodOverLoading;

import Libray.Util;
import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Arrays;

public class MethodCalls {

    public static void main(String[] args) {

        String firstName = "elKEm";
        String lastName = "eemEt";

        String fullName =

              fullName =  Util.formatFullName(firstName, lastName);

        System.out.println(fullName);

        String uniques = Util.uniques(fullName.toLowerCase());

        System.out.println(uniques);

        String reversedName = Util.reverse(fullName);

        System.out.println(reversedName);

        System.out.println("====================================");

        int[] a = {200, 400, 500, 200, 1000, 050, 40,30, 400, 60, 78};
        int n = 2500;
        a = Util.addElement(a, n);// assigning to a makes it work for new array

        System.out.println(Arrays.toString(a)); // gets the 2500 added to end
                            // [200, 400, 500, 200, 1000, 40, 40, 30, 400, 60, 78, 2500]
    }
}
