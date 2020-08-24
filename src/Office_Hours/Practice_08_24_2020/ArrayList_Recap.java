package Office_Hours.Practice_08_24_2020;

/* addAll removeAll retainAll containAll - accept collection type only

 */
import com.sun.media.jfxmediaimpl.HostUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Callable;

public class ArrayList_Recap {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5));

        System.out.println( list1 );

        for (int each : list1){
            System.out.println(each);

        }

        ArrayList<Integer>list2 = new ArrayList<>();
        list2.addAll( Arrays.asList( 30,40,50,60,70,80,90,100,800));

        // remove 40 50 90 200
        list2.removeAll( Arrays.asList(40,50,90,100));
        System.out.println(list2);

        Collections.swap(list2, 0, list2.size()-1);
        System.out.println(list2);

        System.out.println( list2.get(0));
        System.out.println( list2.size()-1);

        //arr[0] = 300
        list2.set(0,300);
        System.out.println(list2);

        Collections.sort(list2);

        System.out.println(list2);

        System.out.println("=====================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll( Arrays.asList("slo", "bob", "john", "sue", "kelly", "kevin"));

        names.removeIf( p -> p.equals("bob"));
        System.out.println(names);

        ArrayList<Integer> grades = new ArrayList<>();
        grades.addAll( Arrays.asList(50,65,45,55,75,85,95,98,100,87,40,52,62,35));

        grades.removeIf( p -> p < 60 );

        System.out.println(grades);

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList( "slo", "keke", "lisa","keke","fee","lisa"));

        System.out.println(students);



    }

}
