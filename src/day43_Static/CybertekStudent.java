package day43_Static;

class A{
    static int a = 200;
}

public class CybertekStudent {

    // for advantages of static

    String studentName;
    int age;
    char gender;

    static String schoolName = "Cybertek School";


    public  void getInfo(){
        System.out.println("name: +studentName");
    }

    public static void printSchoolName(){
        System.out.println("school name: "+schoolName);
    }
}
