package day51_Exceptions;

class B{

    public B(){
        System.out.println("Super Class' default constructor");
    }
}

public class SuperKeyword2 extends B{

    public SuperKeyword2(){
        super();// calls the super class' constructor
        System.out.println("Sub class' default constructor");
    }

    public static void main(String[] args) {
        new SuperKeyword2();
    }
}
