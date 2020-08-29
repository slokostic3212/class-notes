package day47_Encapsulation;

public class MyCredentials {

    public static void main(String[] args) {

        Credentials obj = new Credentials("Mike", 34);

        //obj.username = "cybertek";
        obj.getUsername("Cybertek");
        obj.getPassword("CyberTek12345");

       // System.out.println(obj.userName());
       // System.out.println(obj.password);

        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword());

        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.companyName);


    }
}
