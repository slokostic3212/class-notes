package Office_Hours.Practice_08_12_2020;

import netscape.javascript.JSUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Quiz {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3)  );//static becuz it can be called from class
                                            // call from object need instance method
        //                         0  1 2
      //  int a = 1; // index

        Integer a = 1; // object
        list1.remove(a);  // removes index returns boolean if you pass the object

        boolean r1 = list1.remove(a);
        System.out.println(list1);
        System.out.println(r1);

        String[] names = {"rob", "bran","rick", "bran"};
        ArrayList<String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList(names));

        if(nameList.remove("bran")){// rob rick bran  only 1 bran is removed to remove 2nd use removeAll
            nameList.remove("john");
        }


        System.out.println(nameList);// [rob, bran, rick, bran]

        System.out.println("===============================");
        ArrayList<String> colors = new ArrayList<>();
        colors.addAll( Arrays.asList("green", "red", "blue", "yellos"));

        colors.add(3, "cyan");
        System.out.println(colors);

        System.out.println("============================");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll( Arrays.asList(1,2,3,4,5));//5
        //                          0 1 2 3 4
      /*
        list2.set(0, list2.get(4));
        list2.set(4, list2.get(0));

       */
        Collections.swap(list2, 0,list2.size()-1);
        System.out.println(list2); //52345

        System.out.println("=================================");

        ArrayList<Character> list = new ArrayList<>();
        for ( char i = 'a'; i <= 'z'; i++){
            list.add(i);
        }
        System.out.println(list);

        boolean result = list.containsAll( Arrays.asList( 'c', 'a', 'c'));
        System.out.println(result);

        // remove g l r s t
        list.removeAll( Arrays.asList('g','l','r','s','t'));
        System.out.println(list);



    }



}
