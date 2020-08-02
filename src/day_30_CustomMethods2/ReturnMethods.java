package day_30_CustomMethods2;

public class ReturnMethods {

    public static void main(String[] args) {

        // int num = addition1(3,4);// get 7 but get compile error with int num
        addition1(3,4);

       int sum =  additon2(3, 4 * 2);//add *2 and get 14
        System.out.println(sum);// this method returns 100
       // System.out.println((additon1(3,4) *2);//error
    }

    public static void addition1(int a, int b){// void only executes fxn nothing else - prints out only
        int sum = a+b;
        System.out.println(sum);
    }

    public static int additon2(int a, int b) { //chg to 100200 yet still get 100 return
        int sum = a+b;//will get sum

        return sum;// chaged from 100 to summ // to do it this way will make it reusable
    }
}