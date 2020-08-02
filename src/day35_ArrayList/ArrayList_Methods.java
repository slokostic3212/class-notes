package day35_ArrayList;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.ArrayList;

public class ArrayList_Methods {

    public static void main(String[] args) {
        ArrayList<String> earlyBirdList = new ArrayList<>();
        earlyBirdList.add("Ibrahim");
        earlyBirdList.add("Virginia");
        earlyBirdList.add("Ziiadin");
        earlyBirdList.add("Erfan");
        earlyBirdList.add("Aalia");

        earlyBirdList.set(2, "Aslan");// this is updated
        earlyBirdList.set(0, "Ian");
        System.out.println(earlyBirdList);//[Ibrahim, Virginia, Aslan, Ziiadin, Erfan, Aalia]
        //use set method to replace Ziiadin w Aslan
        //

        System.out.println("=======================================");

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);//0
        list.add(2);// 1
        list.add(3);//2
        list.add(4);//3
        list.add(5);//4


        list.remove(2); // whatever is at index 2 that element will be removed // 1 2 4 5
        //  list.remove(4);// get out of bound because 4 is no longer in the index
        list.remove(3);
        System.out.println(list); // 0 1 3 4 5

        // remove(Element)

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(1);//0
        list2.add(2);//1
        list2.add(3);//2
        list2.add(4);//3
        list2.add(5);//4
        // int a = 1; 1 3 4 5
        Integer a = 1;      // 2 3 4 5

        list2.remove(a);


        System.out.println(list2);

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Hamit");  //0
        list3.add("Liliia"); //1
        list3.add("Bulnet"); //2
        list3.add("Viorel"); //3
        list3.add("Musa");  //4

        //  list3.remove(2);
        list3.remove("bulnet");

        System.out.println(list3);

    }
}