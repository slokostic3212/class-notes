package day47_Encapsulation;

public class Test {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicVariable);
        AccessModifiers.publicMethod();

        System.out.println( AccessModifiers.defaultVariable );
        AccessModifiers.defaultMehtod();

       // System.out.println(AccessModifiers.privateVariable);//not visible win or outside of pkg
       // AccessModifiers.privateVarible();             // will get compile error becuz private not vieble

        Encapsulation obj1 = new Encapsulation();
       // System.out.println(obj1.ssn);//how od i use if i dont have direct access to ssn use get ssn

        System.out.println(obj1.getSsn());

        obj1.setSsn(7654321);  //7654321
        System.out.println(obj1.getSsn());

    }

}
