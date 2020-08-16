package day42_static;

public class Student {

    String name;
    int age;
    int groupNumber;
    char gender;

    static String schoolName = "cybertek shcool";
    static String favoriteTeacher = "nadir";


    public void setInfo (String name, int age, int groupNumber, char gender){
        this.name = name;
        this.age = age;
        this.groupNumber = groupNumber;
        this.gender = gender;

    }

    public String toString(){// an instance method but static variable can be used in this instance mt cuz it belongs to
                             // object and
        return "school name: "+schoolName+"\nstuden name: "+name;
    }
}
