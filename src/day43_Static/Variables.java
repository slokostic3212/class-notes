package day43_Static;

import com.sun.media.jfxmediaimpl.HostUtils;

import java.util.function.DoubleToIntFunction;

public class Variables {

    int d; // instance variable
    static int s;

    public void method2(){
        System.out.println(d);
        System.out.println(s);

    }

    public static void main(String[] args) {
       // System.out.println(a);

        System.out.println(s);
        //System.out.println(d); // static only accepts static

        Variables obj = new Variables();
        System.out.println(obj.d);
    }


    public static void method() {

        int a=10;

        if(true){
            int b = 20;

        }
       // System.out.println(b);

       // System.out.println(a);// need to initialize a to get a
    }

}
