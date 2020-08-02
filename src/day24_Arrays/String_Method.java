package day24_Arrays;

import java.util.Arrays;

public class String_Method {

    public static void main(String[] args) {
        String str = "ABCD";
        char[] ch = str.toCharArray();

        System.out.println( Arrays.toString(ch) );// prints ABCD w ch

        System.out.println("=========================");
        String str1 = "DCEBA";
        String str2 = "ADCBE";

        char[] ch1 = str1.toCharArray();// D C E B A
        char[] ch2 = str2.toCharArray();// ADCBE

        Arrays.sort(ch1);// A B C D E
        Arrays.sort(ch2);// A B C D E

       boolean r1 = Arrays.equals(ch1, ch2);

        System.out.println(r1);

        String sentence = "I Love Programming Language";

        // language programming love i

       String[] words = sentence.split(" "); // split 3x means 4 words I Love Programming Language

        System.out.println(  Arrays.toString(words));// [I, Love, Programming, Language]

        for(int i =  words.length-1; i >=0; i--){
            System.out.print( words[i]+" ");// Language Programming Love I  w spaces +" "
        }
        System.out.println();
        System.out.println("=================================");

        String s = "JAVA";
        s.split("");
        String[] arr = s.split("");// every single element is string
        System.out.println(Arrays.toString(arr));// [J, A, V, A]

        char[] c = s.toCharArray();// each of the elements are char
        System.out.println(Arrays.toString(c));

    }
}
