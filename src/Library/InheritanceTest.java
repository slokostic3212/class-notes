package Library;

import day50_Inheritance_Overriding.AccessModifiers;

public class InheritanceTest extends AccessModifiers {

    public static void main(String[] args) {
        System.out.println(InheritanceTest.publicData);// public is visible outside pkg
        System.out.println(InheritanceTest.protectedData);// prot is visible to any child class anytime
        //System.out.println(InheritanceTest.defaultData);// not visible outside pkg


    }
}
