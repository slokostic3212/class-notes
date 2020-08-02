package day04_Variables;

public class Concate_Add {

    public static void main(String[] args) {
        // addition: number + number
        System.out.println( 12 + 13 );// 25
        System.out.println( 'A' + 2);// 67 does addition because this character has a number therefore it adds
        System.out.println( 'A' + 'B');//131

        // concatenation: append to last characters of string

        System.out.println("12" + 13);//12 is a tex because of "dbl quotes" will get 12313
        System.out.println("A" + 2);//appends the 2 at the end of the string = A2
        System.out.println("Gender: " + 'M');
        System.out.println("Tax: " + 3.5 + '%');
        System.out.println(3.5 + '%' + "Tax");//3.5 + % = 3.5+37+ "Tax"40.5+ " Tax "



    }
}
