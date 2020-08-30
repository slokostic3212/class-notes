package day48_Inheritance.AnimalTask;

public class Cat  extends Animal {

     /*
    variables: 4 name age size gender breed
    methods: 5
     */

    public Cat(String name, String size, int age, char gender, String breed) {
        setInfo(name, size, age, gender, breed);
    }

    public void meow(){
        System.out.println(name + " meowing");
    }

}
