package day58_Polymorphism;

import day58_Polymorphism.AnimalTask.Animal;
import day58_Polymorphism.AnimalTask.Cat;
import day58_Polymorphism.AnimalTask.Dog;

public class InstanceOf_Keywork {

    public static void main(String[] args) {
        Animal animal1 = new Animal(10, 'F');
        Animal animal2 = new Dog("Winston", 4,'M');
        Animal animal3 = new Cat("Sally", 5, 'F');

        //verify animal3 is the obj of the Animal class
        boolean r1 = animal3 instanceof Animal;// IS A relation ==> true

        System.out.println(r1);
    }
}
