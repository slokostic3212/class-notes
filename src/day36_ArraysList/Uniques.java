package day36_ArraysList;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

/*
3.  write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques

            ex: list==> {1,1,2,3,3,4,5}
                uniques ==> {2,4,5}
 */
public class Uniques {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // 1 1 2 3 3

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);

        ArrayList<Integer> uniques = new ArrayList<>();//2 expected result

        for (int i = 0; i <= list.size() - 1; i++) {// chg to Interger element : list andget rid of below w forea loop

            Integer element = list.get(i);// chg 0 to i// no need this if using for each loop see above
            int count = 0;

            for (Integer each : list) {// finds the freq of element
                if (each == element) {
                    count++;
                }
            }

            if (count == 1) {// to verify if element is unique
                uniques.add(element);// this is to id if 1st element is unique

            }

 /*       Integer element = list.get(i);// chg 0 to i
        int count = 0;

        for( Integer each  : list ){
            if (each == element){
                count ++;
            }
        }

        if (count == 1){
            uniques.add(element);// this is to id if 1st element is unique
        }

  */
        }
        System.out.println(uniques);// [2]
    }

}