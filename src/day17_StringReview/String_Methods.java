package day17_StringReview;

public class String_Methods {
    public static void main(String[] args) {
        //charAt(index); extra info needed to do an extra fxn  == returns char and can assign to variable of char
        String str = "Cybertek";// index numbers start from  y = 1
        //            01234567

        char ch1 = str.charAt(1); // to get k it would be 7
        System.out.println(ch1);

        String str2 = "Cybertek";
                str2 = str2 + "School";// need to assgin str2 + "School" to get both otherwise str2 ref'd "Cybertek"
        System.out.println(str2);// Cybertek School


        //length(); == returns == int
        String str3 = "Cybertek"; //add School the .length() method will return last char so return is l (15)
        //             01234567
            int l = str3.length(); // returns 8 of characters
        System.out.println(l);

        //lastIndex;  length - 1
        // TO PRINT OUT THE LAST INDEX OF A STRING YOU DONT' KNOW   + 1

        char ch2 = str3.charAt(l -1);// returns 7 and k is there at index 7 = str3.length() 1 ==15 last index = 14
        System.out.println(ch2);// get an out of bounds msg -2 not a number cuz it starts at "0"

        System.out.println("last index: "+ (l -1));

        // upperCase & lowerCase;  they will create a new string not modify the object

        String str4 = "cybertek";
               str4 = str4.toUpperCase(); // "CYBERTEK"

        System.out.println(str4);//still refs old object which is lower case till you assign = operator and
                                    // change to uppercase

        //lowerCase()

        String str5 = "JAVA";
            str5 = str5.toLowerCase();//no changes can be made to object == immutable  "java"

        System.out.println(str5); // java now in lowerCase

        // trim() removes white space -

        String str6 = "    Cybertek              ";// all space will be removed if another word - does not
                                                    // remove space btw words just before and after
        System.out.println(str6); // will not modify thereby create a new string wo spaces

        str6 = str6.trim();// cybertek w space before assigning
        System.out.println(str6);

        // substring = =  a portion of specific string
        //ENDING INDEX == EXCLUDED
        //BEGINNING INDEX == INCLUDED

        String str7 = "I Like Java Language";
        //             012345678910

        String word = str7.substring(7, 10 +1);// must add +1 to get Java if give 10 index gets Jav
        System.out.println(str7);// if we kept str7 it would return i like java language thats why u assign variable
        System.out.println(word);

        String word2 = str7.substring(12, str7.length() ); // prints language for ending index and want to include
                                                                // ending index
                                                            // 12 only will give ending index
        String word3 = str7.substring(12);
        System.out.println(word2);
        System.out.println(word3);

        String word4 = str7.substring(2, 5 +1);
        System.out.println(word4);


        // indexOf && lastIndexOf== retruning of index number == int

        String str8 = "Hello Batch 20, Have a Wonderful day, We are happy to see you"; // what is W MAKE SURE NO OTHER W
                                // added We are happy to see you
             int i1 = str8.indexOf("W");
        System.out.println(i1);// to confirm index number use charAt method

        System.out.println( str8.charAt(i1));

        int i2 = str8.indexOf(", W") + 2; // will give first w need to find something unique about the second W so change
                                    // to (", W") +2;
        int i3 = str8.indexOf("We");

        System.out.println(i2);// get 38
        System.out.println(i3);// get 38

        //lastIndexOf

        String str9 = "Java Java Java";// how" do i get the last J
        str9.lastIndexOf("J");

        int i4 = str9.lastIndexOf("J");
        int i5= str9.lastIndexOf("J");
        int i6 =  str9.lastIndexOf("Java") + 1;
        int i7 = str9.lastIndexOf("Java ");

        System.out.println(i4);//10
        System.out.println(i5);// 10
        System.out.println(i6); // 11
        System.out.println(i7);// 5


        // replace and replaceFirst() =  replace all old values wi new given ones
            String s1 = "I like Java, Java is a programming language";//it will replace both javas
            s1 =s1.replace("Java", "C#");// now assigned will get i like c# c# ...
                                                // will replace all old values w new one

        System.out.println(s1);//refs old object till get a variable assignemnt

        // to replace only one

        String s2 = "I like Java, Java is a programming language";
        s2 = s2.replaceFirst("Java", "C#");// only first one will get reassigned
                                                          //   like C#, Java is a programming language
        System.out.println(s2);

        String s3 = "I like Java, Java is a programming language";
        s3 = s3.replace("Java is", "C# is");

        System.out.println(s3);//. now get I like Java, C# is a programming language





    }
}
