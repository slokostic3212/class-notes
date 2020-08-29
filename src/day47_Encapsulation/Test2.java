package day47_Encapsulation;

public class Test2 {

    static int a = 200;

    static{
        a = 300;// this gets executed first

    }

    public Test2(){// this gets executed when we create an obj we dont have one here -
        a = 400;
      }


    public static void main(String[] args) {
        new Test2();
        a = 600;
        System.out.println(a);
    }
}
