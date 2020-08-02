package day26_MultiDimensionalArray;

import java.util.Arrays;

/*2. write a program that can return the number of appearances of
	"java" and "python" anywhere in the sentence

	ex:
		input I love Java, Python is cool
		output I Java I Python

		input Java Java Python Python Python
		output 2 Java 3 Python

 */
public class Java_Python {
    public static void main(String[] args) {
        String sentence = "I love Java, Python is cool Javascript";// use split to get words in arr

        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));// use contains to see if contains java and count towards freq of java
        int countJava = 0;
        int countPython = 0;

        for (String each : words){
            if(each.contains("Java")){//chg to toLowerCase if java/ java java noted contains"java"
                countJava++;
            }else if(each.contains("Python")){//chg to toLowerCase if java/ java java noted contains"java"
                countPython++;
            }

        }
        System.out.println("Java: " +countJava);//2
        System.out.println("Python: " +countPython);//1
    }
}
