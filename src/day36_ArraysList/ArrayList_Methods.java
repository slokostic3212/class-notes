package day36_ArraysList;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.ArrayList;
/*
indexOf()
lastIndexof()
contains()
equals()
isEmpty()
 */

public class ArrayList_Methods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);// 0
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);// 4
        list.add(40);//5


        int a = list.indexOf(40);// used forreturning index num only

        System.out.println(a);

        System.out.println( list.indexOf(60));// -1 cuz 60 does not exist in the list

        System.out.println(list.lastIndexOf(40));// get 5

        boolean r1 = list.contains(100);//false since 100 not here

        System.out.println(r1);

        System.out.println("========================================");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Cybertek");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Cybertek");

        System.out.println(list1);
        System.out.println(list2);

        System.out.println( list1.equals(list2));

        ArrayList<Integer> list3 = new ArrayList<>();

        list3.add(10);
        System.out.println( list3.isEmpty());// true till you added list3.add(10)

    }

}
