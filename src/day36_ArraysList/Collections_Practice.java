package day36_ArraysList;


import java.util.ArrayList;
import java.util.Collections;

public class Collections_Practice {
    /*
    {30,20,40,50,15} array list
    50 40 30 20 15 = output
     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(30);// 0
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(15);//4 // 30 20 40 50 15

        Collections.sort(list);// 15 20 30 40 50
        System.out.println(list);

        ArrayList<Integer> descendingList = new ArrayList<>();

        for(int i = list.size()-1; i >= 0; i--){
           // System.out.print( list.get(i) +" ");//50 40 30 20 15  could do this or below

            descendingList.add( list.get(i));
        }

    }
}
