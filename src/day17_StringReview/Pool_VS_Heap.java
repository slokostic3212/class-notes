package day17_StringReview;

public class Pool_VS_Heap {

    public static void main(String[] args) {
        String s1 = "Cybertek"; // held in string pool
        String s2 = "Cybertek"; // 2 objects but only one in pool
        String s3 = new String("Cybertek"); // located in heap
        String s4 = new String("Cybertek"); //heap

        String s5 = "cybertek"; // string pool = =  case sensitive  this will create a new object in str pool

        System.out.println( s1 == s2);//both sharing same object so there are the same == true
        System.out.println( (s1 == s3)); // false
        System.out.println(s3 == s4);// false - same but indifferent menory
        System.out.println(s5 == s2);// false becuz they are different objects in pool
        System.out.println(s5 == s1);// false






    }
}
