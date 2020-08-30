package day44_Constructor;
/*
declare:										no specifier or returnType in constructor
			Access-Modifier    className(Parameters){
			  statements;
			}
 */


public class ConstructorIntro {

    public ConstructorIntro(String arr) {
        System.out.println("Hello "+arr);
        System.out.println("How are you "+arr);

    }

    public static void main(String[] args) {

        //ConstructorIntro obj1 = new ConstructorIntro(10);

       //ConstructorIntro obj2 = new ConstructorIntro();

    ConstructorIntro obj3 =  new ConstructorIntro("Muhtar");
    ConstructorIntro obj4 =  new ConstructorIntro("Asiya");
    ConstructorIntro obj5 =  new ConstructorIntro("Nadir");




    }

}
