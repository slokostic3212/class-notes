package day12_Switch_Scanner;

public class Switch {
    public static void main(String[] args) {
        int a = 1;
        switch(1){// to 10 no matching then default get executed automatically get "Invalid case"

            case 5:
                System.out.println(5);// "Five" will get this
                break;

            case 1:
                System.out.println(1);//"One" will get this
            default:
                System.out.println("Invalid Case");// this will get printed with 1 becuz no break
        }
    }
}
