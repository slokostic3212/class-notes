package day16_String;
/*3. write a method that asks user to enter a string
	if string is empty 	== print: string is empty
	if string has > 3 characters == print: the last three characters // length -1 -2 -3 last index numbers
	if string has <= 3 characters == printL the string itself


4. write a program for CheckWords:

	Program accepts 3 words and :

		if they are the same length: print== "All words are the same"

		if some are the same length and others not:

					print == "Not Same nor Different lengths"

		if all are different lengths: print== "All different length"
*/

public class CheckWords {

    public static void main(String[] args) {// ifwant to use scanner add Scanner scan = new Scanner(System.in);
        String str = "I like java";// last index number = lenght - 1  // change to "ABC" get empty string
        // second last index number = length -2
        // third last index number = length -3  use String str = scan.next();

        if (str.length() == 0) {
            System.out.println("empty string");
        } else if (str.length() > 3) {
            System.out.println(str.substring(str.length() - 3));// just the beginning index create substring from str starting
            // from the third last index
        } else {
            System.out.println(str);// expected result ava
        }

        // can use ternary
        String result = (str.length() == 0) ? "empty string"
                : (str.length() > 3) ? (str.substring(str.length() - 3)) : str;

        System.out.println(result);

        System.out.println("==================================================");
        String str1 = "abcd";
        String str2 = "abc";
        String str3 = "ab";

        boolean allSame = str1.length() == str2.length() && str1.length() == str3.length();
        boolean allDifferent = str1.length() != str2.length() && str2.length() != str3.length() &&
                                str1.length() != str3.length();

        if( allSame ){
            System.out.println("All words are same length");
        }else if(allDifferent){
            System.out.println("All different length");
        }else{
            System.out.println("Not Same nor Different lengths");
        }

    }

}