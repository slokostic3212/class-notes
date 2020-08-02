package day36_ArraysList;

import java.util.ArrayList;
import java.util.Collections;

/*
Arrays - utility class for arry
Colletions - utility for collection
 */
public class Collections_Utility {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(15);
        list.add(10);
        list.add(40);
        list.add(30);//5

        Collections.sort(list);

        System.out.println(list);

        System.out.println("Max number: "+list.get( list.size()-1) );

        System.out.println("Min number: "+list.get(0));

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        list2.add("E");//5

        System.out.println(list2);

        Collections.swap( list2, 1, 2);// A C B D E

        System.out.println(list2);

        Collections.swap(list2, 0, list2.size()-1);

        System.out.println(list2);//E, C, B, D, A]

        ArrayList<Character> charlist = new ArrayList<>();
        charlist.add('A');
        charlist.add('B');
        charlist.add('A');
        charlist.add('A');
        charlist.add('A');
        charlist.add('C');

        int count = Collections.frequency(charlist, 'A');

        System.out.println(count);
    }
}
