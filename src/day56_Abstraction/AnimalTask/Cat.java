package day56_Abstraction.AnimalTask;

import com.sun.media.jfxmediaimpl.HostUtils;

public class Cat extends Animal implements Playable{

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    @Override
    public void play() {
        System.out.println("Cat is playing");
    }
}
