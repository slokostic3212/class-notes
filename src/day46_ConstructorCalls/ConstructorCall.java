package day46_ConstructorCalls;

import day45_Constructor.Constructor;

public class ConstructorCall {

    public ConstructorCall(){
        method1();
        method2();
        method3();
    }


    public static void method1(){
        method2();

        // ConstructorCall();
    }

    public static void method2(){
        method1();
    }

    public void method3(){
        //  ConstructorCall();
       // this(); // can only use inside of constructor
    }


}
