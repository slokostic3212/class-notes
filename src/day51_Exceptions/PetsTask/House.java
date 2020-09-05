package day51_Exceptions.PetsTask;

public class House {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Winston","Scotty Terrier",'M',4, "Black");

        System.out.println(dog1.name);// able to initialize this to dog name winston

        System.out.println( dog1 );//now prints Dog from Pet from overriding

        Cat cat1 = new Cat("Salomon","Belgian",'M',3,"Orange");

        System.out.println(cat1);

        Tiger tiger1 = new Tiger("Zara","Caspian",'M',12,"Black/White Stripe");

        System.out.println(tiger1);


    }

}
