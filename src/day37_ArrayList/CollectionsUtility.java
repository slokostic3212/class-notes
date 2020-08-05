package day37_ArrayList;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(30,20,56,78,98,100,20,0,-1,-3,400,500,5000));

        //max number
      Integer max =  Collections.max(list);

      //min number

        Integer min = Collections.min(list);

        System.out.println("Max number: "+max);
        System.out.println("Min number: "+min);

        System.out.println("============================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll( Arrays.asList("ramazan","islem","muhtar", "saim" ));//must pass a collection type here chg names to

        //replace all

        Collections.replaceAll(names, "muhtar","fatima");
        System.out.println(names);


        


    }
}
