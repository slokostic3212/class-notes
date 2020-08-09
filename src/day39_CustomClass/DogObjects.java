package day39_CustomClass;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();


        dog1.setDogInfo("Siwan","Beagle","medium",2,"Mix");
        dog2.setDogInfo("Roofus", "Argentinian Dogo", "Large", 1, "White");
        dog3.setDogInfo("Winston", "Scotties Terrier", "Small", 1, "Black");

        dog1.getDogInfo();
        dog2.getDogInfo();
        dog3.getDogInfo();

        dog3.drink("water");
        dog1.drink("water");
        dog2.drink("water");

        dog1.eat("food");
        dog3.eat("food");
        dog2.eat("food");

        dog1.sleep();
        dog2.sleep();
        dog3.sleep();

    }
}
