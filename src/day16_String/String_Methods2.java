package day16_String;

public class String_Methods2 {

    public static void main(String[] args) {
        String name1 = "Cybertek";// used in if statements

        System.out.println(name1.isEmpty());// false

        String name2 = "";

        System.out.println(name2.isEmpty());//true

        String str1 = "Java";// string lit in string pool
        String str2 = new String("Java");

        System.out.println(str1+" : "+str2);//
        System.out.println( str1 == str2 );// false
        System.out.println(str1.equals(str2) );//true

        String str3 = new String("Java");
        String str4 = new String("Java");

        System.out.println(str2 == str4);// false
        System.out.println(str3.equals(str4));//true

        String str5 = "Java";//lit
        String str6 = "Java";// i object in  pool shared by 2 variables

        System.out.println( str5 == str6 );// true
        System.out.println( str5.equals(str6));// true

        String str7 = "JAVA";//false java is case sensitive
        String str8 = "java";

        System.out.println(str7.equals(str8));//false due to case sensitivity

        // YES Yes yes yEs if you want to ignore case sensitiviy use equalIgnoreCase() method

        System.out.println(str7.equalsIgnoreCase(str8));//true


    }
}
