package day45_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

/*
 create a class called ShoppingList
                create 5 objects of Item and store them into List of Items
                calculate the total cost of all Items in the list
*/
public class ShoppinList {
    public static void main(String[] args) {

        Item item1 = new Item("milk", 2.9, 1);
        Item item2 = new Item("eggs", 3.4, 2);
        Item item3 = new Item("watermelon", 5.9, 1);
        Item item4 = new Item("coffee", 12.7, 1);
        Item item5 = new Item("clementines", 6.5, 5);

        ArrayList<Item> list = new ArrayList<>();
        list.addAll(Arrays.asList(item1, item2, item3,item4, item5));

        System.out.println("items: "+list.size());
        double totalCost = 0;

        for ( Item each :  list){
            totalCost += each.calcCost();
        }

        System.out.println("total price: "+totalCost);

        System.out.println("==========================");

        Item[] items = {item1, item2, item3, item4, item5};
        double totalCost2 = 0;

        for (int i = 0; i <= items.length-1; i++){
            totalCost2 += items[i].calcCost();

        }
        System.out.println("total cost: "+totalCost2);

    }
}
