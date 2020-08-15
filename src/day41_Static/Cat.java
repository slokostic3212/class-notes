package day41_Static;
/*
cat class
		attributes :
			name age gender color breed

		actions :
			eat drink toString

make sure you can print out the objects of the cat in the print statement

 */
public class Cat {
    String name;
    int age;
    char gender;
    String color;
    String breed;

    public void setCatInfo(String name, int age, char gender, String color, String breed){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.color = color;
        this.breed = breed;
    }

    public void eat(String catFood){
        System.out.println(name+" is eating "+catFood);
    }

    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }


        /*
        cat1:
        cat2:
        cat3:
         */

    public String toString(){ //will be executed automatically when the cat object is passed in the print statement
        return "Name: "+name+", Breed: "+breed+", Gender: "+gender+", Age: "+age+", Color: "+color+" |";
    }

}