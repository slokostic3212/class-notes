package Library;

import day47_Encapsulation.AccessModifiers;


public class Test_AccessModifiers {
    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicVariable);
        AccessModifiers.publicMethod();

       // System.out.println( AccessModifiers.defaultVariable);//access mod of default - - only visibe in same pkg
                                                            // so not visible here
                                                               // need to chg acc mod to public
        // AccessModifiers.defaultMethod;

        //System.out.println(AccessModifiers.privateVariable);//get compile error cuz not visible outside of pkg
        //AccessModifiers.privateMethod;        //get compile error cuz not visible outside of pkg
    }

}
