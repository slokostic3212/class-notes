package Office_Hours.Practice_08_25_2020;

import com.sun.org.apache.xalan.internal.xsltc.dom.ArrayNodeListIterator;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Review {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        System.out.println(list1);

        int[] nums1 = {80,90,100};// chg from Integer[]
        //comp error becuz collection does not support primitives
        Integer[] nums2 = {80,90,100,90};// added extra 90 for removeAll() method

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(list1);
        list2.addAll(Arrays.asList(50,60,70));
       // list2.addAll( Arrays.asList( nums ));// will not accept nums cuz its not a collection type
        list2.addAll(Arrays.asList( nums2 ));


        System.out.println(list2);
/*
       // list2.remove(8);//the index
        Integer a = 90;
      //  list2.remove(a);
        list2.remove(new Integer( 90));//90 is value of the integer w value of 90
       // list2.remove(90);//get out of bound error
        list2.remove(new Integer(30));
        list2.remove(70);
*/
        list2.removeAll(Arrays.asList(30,70,90));// get compile error if just put in 30 0 90 beczu removeAll is part of
                                    // bult operation need to convert to collection type

        list2.removeIf( p -> p >50 );//60 80 100 will be removed
        System.out.println(list2);// 1st 90 has been removed

        list2.addAll( Arrays.asList( 100,200,300,100,100,100));

        list2.retainAll( Arrays.asList( 100,200,300));

        System.out.println(list2);

        System.out.println("size: "+list2.size());//6

        list2.clear();//all is removed -  value of list i empty will get true

        System.out.println(list2);
        System.out.println(list2.isEmpty());
        System.out.println("size: "+ list2.size());

        System.out.println("=====================================");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll( Arrays.asList( 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));

      //  list3.set( list3.size()-1, 30);
        System.out.println(list3);

        for ( int i = 0; i <= list3.size()-1; i++){

            Integer each = list3.get(i);
            if ( each % 2 != 0){
                list3.set(i, each * 2);

            }else{
                list3.set(i, each * 3);
            }
        }
        System.out.println(list3);

        System.out.println("====================================");

        ArrayList<String> countries = new ArrayList<>();

        countries.addAll( Arrays.asList( "america", "england", "australia", "new zealand", "russia", "canada"));

        //countries.removeIf( c -> c.endsWith("a"));// below statement is the same as here
        countries.removeIf( c -> c.charAt( c.length()-1 ) == 'd');// need boolean not char // chg to d from a

        System.out.println(countries);


    }

}
