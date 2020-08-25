package Office_Hours.Practice_08_25_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


/*collection methods:
    swap
    sort
    max
    min
    frequency
 */

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90));
//                                  0  1  2  3  4  5  6  7  8
        Collections.swap(list1, 0, 1);
        Collections.swap(list1, list1.size() - 2, list1.size() - 1);

        Collections.sort(list1);

        System.out.println(list1);

        Integer max = Collections.max(list1);
        Integer min = Collections.min(list1);

        System.out.println("max number: " + max);
        System.out.println("min number: " + min);

        System.out.println("=============================");

        String[] arr = {"eggs", "milk", "milk", "tp", "tp", "tp", "tp", "avacado" };

        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList( arr));
        System.out.println(items);

        int count =  Collections.frequency(items, "tp");
        System.out.println(count);

       // items.removeIf( I -> Collections.frequency(items, I) != 1);
        items.removeIf( I -> Collections.frequency(items, I) == 1);
        System.out.println(items);


    }


    }
