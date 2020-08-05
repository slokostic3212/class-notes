package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysList_Methods {
    // remove size set get equals coantains clear.

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("bmw","mercedes", "infiniti","tesla", "jaguar", "vw", "lambo","lexus","tesla","mazda",
                "miata"));
        //                          0       1           2         3         4       5       6       7
      //  cars.remove(3); // passing index
      //  cars.remove("tesla"); // remove element - removes first matching one and only 1 if u want more
                                // remove all used

      //  cars.removeAll( Arrays.asList("tesla") );//removes all the matchng elements

        //use removeIf if there is a conditional statement - ie remove all with M in the name

       // cars.removeIf( p -> p.toLowerCase().contains("m"));

        cars.retainAll( Arrays.asList("tesla"));

        System.out.println(cars);

        System.out.println("======================================");

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.addAll( Arrays.asList( "eggs", "milk", "paper towels", "toilet paper", "mango", "cado", "nana",
                "coke", "orange") );

        //pepsi
        boolean r1 = groceryList.contains("pepsi");
        System.out.println(groceryList);
        System.out.println(r1);
        
        // eggs milk orange see if all is here

        boolean r2 = groceryList.containsAll( Arrays.asList("eggs", "milk", "orange"));// will return false if water is here

        System.out.println(r2);

        System.out.println("Total number of items: "+ groceryList.size());// size

          // set the dragon fruit to apple: drag fruit is last index 7 size -1 if you did not know last indes

        groceryList.set(groceryList.size()-1, "apple");

        System.out.println(groceryList);

        groceryList.set( groceryList.indexOf("paper towels"), "dishwashing liquid");

        System.out.println(groceryList);
    }
}
