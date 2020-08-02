package day15_String;

public class substring_method {
    public static void main(String[] args) {

        String sentence = "Java is fun";
        //                 0123456789..
        // get the word java from this string ==> the substring
        //substring(beg index, end index)
        String word1 = sentence.substring(0, 4);//0 is the beginning index then comma then
        // 0 , 3 will give Jav need to add 4 to the ending index to print
        // Java so use 0 , 4 == Java can also use 0, 3+1

        System.out.println(word1);

        String word2 = sentence.substring(8, 10 + 1);// 11 is total number of characters in string
        System.out.println(word2);

        System.out.println("============================");

        String sentence2 = "I like Movies and TV Series";
        //                  0123456789
        String word3 = sentence2.substring(7, 12 + 1);

        System.out.println(word3);

        System.out.println("================================");

        String firstName = "sloBODAnKA";// leave first charc at upper lase and the rest lower
        //change to Cypertek gives YBERTEK
        String firstCharacter = firstName.substring(0, 1);
        String rest = firstName.substring(1, firstName.length());//LOBODANKA
        // give .length because u may not know
        // how long the string is and the lasr inex
        // will be included
        // meanslast index + 1

        firstName = firstCharacter.toUpperCase() + rest.toLowerCase();

        System.out.println(firstCharacter);//S
        System.out.println(rest);

        System.out.println(firstName);

        System.out.println("=================================");

        String lastName = "linNmA";// chg to linNaM to see out put from school
        String firstChar = lastName.substring(0, 1); // lowercase s
        String remaining = lastName.substring(1);// chool

        System.out.println(firstChar);//
        System.out.println(remaining);

        lastName = firstChar.toUpperCase() + remaining.toLowerCase();
        System.out.println(lastName);

        System.out.println("====================================");
        String s = "I like Game Of Thrones";
        //          01234567
        String series = s.substring(7);//give output Game Of Thrones
        System.out.println(series);

        String s2 = "I like Java Programming Language";
        //           01234567
        String language = s2.substring(7);

        System.out.println(language);// Java Programing Language

    }
}
