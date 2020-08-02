package day29_CustomMethods;

public class PalindromeTest {
    /* kaya lala == > rever same as original -- true
       Java == > false
     */

    public static void main(String[] args) {
        palindrome("cybertek");
    }

    public static void palindrome(String word){
        String reversed = "";
        for (int i = word.length()-1; i >= 0; i--){
            reversed += word.charAt(i);
        }

        System.out.println( reversed.equalsIgnoreCase(word));
    }
}
