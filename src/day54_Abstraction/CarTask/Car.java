package day54_Abstraction.CarTask;
/*
Car -> abstract (its generic)
 		start();

 	BMW
 		start(): push button start

 	Tesla
 		start(): voice control start

 	Toyota
 		start(): key insert start

 	Jeep
 		start(): jump start start

 		  Access-Modifier  abstract    Return_type    methodName(Parameter);
          (non  private)     MUST         MUST


 */
public abstract class Car {

    public Car(){

    }

    public abstract void start();


}


final class A{  // can be final

}

class B{
    public static void main(String[] args) {
        A obj1 = new A();
        // Car obj2 = new Car();
}

}
