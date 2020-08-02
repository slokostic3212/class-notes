package day37_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Uniques {

    public static void main(String[] args) {
 /*       String str = "AABBCDDEE";// C is unique  inner loop = freq and adds to count
                                    // outr loop gets freq of char and assign to char ch (7.14 off hrs class)
                                    // can get rid of inner loop if use collections method
        ArrayList<Character> list = new ArrayList<>();// use for loop gets index for each gets each element must have
                                                        // data struc to use and this string is not part of data struc

        for ( String each : str.split("") ){// each reps every single char in string chg to split method
            list.add(each);

        }
        System.out.println(list);

        for ( String : list){
            int count = Collections.frequency(list,each);// change to each from A
        if (count == 1){
            uniques += each;
            System.out.println("A");//
        }
        }
        int count = Collections.frequency(list,"A");// move to above under for loop
        if (count == 1){
            System.out.println("A");
        }


        System.out.println(count);

  */
        String str = "AABBCDDEAF";
        String uniques = "";

        ArrayList<String> list = new ArrayList<>();

        for(String each  : str.split("") ){
            list.add(each);
        }

        System.out.println(list);


        for( String each : list){
            int count = Collections.frequency(list, each);
            if(count == 1){
                uniques += each;
            }
        }


        System.out.println(uniques);


    }

}
