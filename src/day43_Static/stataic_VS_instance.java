package day43_Static;

public class stataic_VS_instance {

    static  int staticVariable;// 1 copy
    int instanceVariable;// 2copies

    public static void main(String[] args) {

        stataic_VS_instance obj1 =  new stataic_VS_instance();
        obj1.instanceVariable = 100;
        obj1.staticVariable = 500;

        stataic_VS_instance obj2 = new stataic_VS_instance();
        obj2.instanceVariable = 200;
        obj2.staticVariable = 400; // dont call any static thr object not preferred way in java
                                    // call static via class name


        System.out.println(obj1.instanceVariable);//100
        System.out.println(obj2.instanceVariable);//0 because nothing was initialized chgs to 200 when initialized

        System.out.println("==============================");
        System.out.println(obj1.staticVariable);
        System.out.println(obj2.staticVariable);

        System.out.println( stataic_VS_instance.staticVariable);


    }
}
