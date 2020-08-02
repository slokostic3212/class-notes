package day35_ArrayList;

import java.util.ArrayList;

/*
1. write a program that can print the list of integers in reversed order
        ex:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1
 */
public class ReversedOrder {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();// size of list is 10 by default
                                // size is automatically adjusted
        list.add(10);//0 // by default its int - can assign primitive val by wrapper class - autoboxing process
        list.add(20);//1
        list.add(2,30);//2 when add 1 this means 30 will be added to index 1
                                    // indexes cannot be skipped need to initial index 2 before initializing index 3
        list.add(40);//3
        list.add(50);//4

        System.out.println(list.size());// size incred when u add got [] w list alone but w list.size u get 1

            for (int i = list.size()-1; i >= 0; i--){
                System.out.print( list.get(i) +" ");// this get method returns u an integer and a val of integer
            }

    }
}
