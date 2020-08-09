package day39_CustomClass;
/*
 Dog:
 	instance variables:
 		breed size age color

 	instance methods:
 		setDogInfo()	getDogInfo()  eat drink sleep ...
 */
public class Dog {
    String name;
    String breed;
    String size;
    int age;
    String color;

    //this sets the info of the dog by assigning argum to variables of dog
    public void setDogInfo(String dogBreed, String dogSize, int dogAge, String dogColor, String dogName){

        breed = dogBreed;
        size = dogSize;
        age = dogAge;
        color = dogColor;
        name = dogName;

    // sets the information of the dog
        public void getDogInfo(){
            System.out.println("Name: "+name+", Breed: "+breed+", Size: "+size+", Color: "+color+", Age: "+age+" years old");
        }

      /*
      dog1: husky
      dog2: pitbull
      dog3: golden
       */


    }

}
