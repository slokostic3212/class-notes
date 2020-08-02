package day08_Logical_Operators;

public class Odd_Even {
    public static void main(String[] args) {
        int number = 100;// change tor 101

        boolean even = number%2 == 0;
        boolean odd = !even;

        if(even){
            System.out.println(number+" is even number");// willnot print wo extra if statement
        }

        if (odd){
            System.out.println(number+" is odd number");
        }

    }
}
