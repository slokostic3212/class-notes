package day_30_CustomMethods2;

import Libray.Util;

public class MethodCalls {

    public static void main(String[] args) {
        String str = "aaaaabbbbcccccccc";
        String str2 = Util.removeDup(str);

        System.out.println(str2);
    }
}
