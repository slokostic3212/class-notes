package Office_Hours.Practice_08_31_2020;

import com.sun.org.apache.xpath.internal.operations.Variable;

public class Static_VS_Instance {
    int insVariable;
    static int staticVariable;// global variable


    public static void main(String[] args) {
        System.out.println(staticVariable);// 0
       // System.out.println(insVariable);// static only accepts static

        Static_VS_Instance obj = new Static_VS_Instance();
        System.out.println( obj.insVariable );// 0

        System.out.println("================================");

        Static_VS_Instance obj1 = new Static_VS_Instance();
            obj1.insVariable = 100;
            obj1.staticVariable = 200;



        Static_VS_Instance obj2 = new Static_VS_Instance();

        System.out.println(obj1.insVariable);//0
        System.out.println(obj1.staticVariable);//0




    }
    public void method(){
        System.out.println( insVariable );
        System.out.println( staticVariable );

    }

}
