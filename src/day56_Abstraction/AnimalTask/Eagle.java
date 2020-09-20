package day56_Abstraction.AnimalTask;

import day48_Inheritance.AnimalTask.Animal;

public class Eagle extends Animal implements Flyable {
    @Override
    public void eat() {
        System.out.println("Eagle is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Eagle is sleeping");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }
}
