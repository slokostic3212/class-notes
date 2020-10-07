package Office_Hours.Practice_10_07_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ListPractice {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();// change to linkedList will get same output cuz they all list
                                              // same for Vector same for Stack
        list.addAll( Arrays.asList("Slo", "John", "Alex", "Bob", "Alex"));
//                                   0       1      2       3       4 index numbers
        System.out.println(list);
        System.out.println(list.get(2));

        Stack<String> stack = new Stack<>();
        stack.addAll( list );

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);


    }

}
