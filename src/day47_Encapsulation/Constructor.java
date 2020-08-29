package day47_Encapsulation;

public class Constructor {
    static{
        System.out.println("static block");
    }

    public Constructor(int a ){// no this() keyword can be used here
      //  this(10); // get an error cuz construc cant call itself - repititon
        System.out.println("int arg");

    }
    public Constructor(double a){
        this(10); //int arg printed 1st
        //this("A)
        System.out.println("double arg");// dbl arg 2nd
    }

    public Constructor(String a){
        this(5.5);// int, dbl
        System.out.println("String arg");// string
    }

    public static void main(String[] args) {

        //new Constructor();

        //new Constructor(10);
        // new Constructor(10.0);
        new Constructor("A");
    }

}
