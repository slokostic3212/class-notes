package day16_String;

public class String_Methods {
    public static void main(String[] args) {

        String email = "cybertek@gmail.com";//needs to be yahoo and not gmail

        email = email.replace("gmail", "yahoo");

        System.out.println(email);// now get yahoo

        String wood = "java";
        wood = wood.replace("a", "e");//get jeve - can use java andjeve  can be reversed back

        System.out.println(wood);

        String sentence = "I like to learn Java, Java is cool, Java is fun"; // replace 2nd java w c# and
        // 3rd w python
        sentence = sentence.replace("a, Java", "a, C#"); // need to specify which java to replace
                                                                    // need to give unique characters
        // at the location before or after
        // get I like to learn Java, C# is cool, Java is fun
        sentence = sentence.replace("Java ", "Python ");
        System.out.println(sentence);//get I like to learn Java, C# is cool, Python is fun

        String s1 = "I like to stay in Cybertek, Cybertek is nice place"; // change to MIT
        s1 = s1.replace("Cybertek", "MIT");//still prints cybertek becuz s1 only ref's above not MIT

        s1 = s1.replace("MIT", "Cybertek");// now will go back

        System.out.println(s1);

        String s2 = "I like to leaRn Java, we aRe enjoying Java"; // replace R to r // gvie ex w more r's
        s2 = s2.replace('R', 'r');// new string will be "I like to learn Java"
                                                // can use s2.replace("R", "r";

        System.out.println(s2);// R now prints r

        //replaceFirst:

        String s3 = "I like to drint tea and tea"; // want to replace 1st tea = both willget resplace
        s3 = s3.replaceFirst("tea", "cola");//"i like to drink cola and tea" and replace()
        //will replace all teas
        System.out.println(s3);

        String s4 = "I like to Watch Game of thrones, and Walking dead";// delete and walking dead done w an empty
                                                                        // string
        s4 = s4.replace(", and Walking dead" ,"");//"i like to watch game of thrones"
                                                                  // dont forget to assign s4
        System.out.println(s4);//jcan add a . in "" to get a period at end

        // indexOf():

        String s5 = "I like to stay in cybertek, we are learning java";// returns index of firt r
        int r1 = s5.indexOf("r");//first r index
        int r2 = s5.indexOf("re");// looks for the specific r whre it is re and gives that index number
                    // if change to ar will get a need to at +1 so its better to add the specific to do at back of r
        int r3 = s5.indexOf("rn");//last r's indext number  chng to rning java = still get 38

        System.out.println(r1);
        System.out.println( s5.charAt(r1));//get 22
        System.out.println(r2);//32 from r from are
        System.out.println(r3);//38 from last r from learning

        //lastIndexOf() of last occured number
        String s6 = "Java is a programming language, and Java is fun";

        int I1 = s6.indexOf("J");// add 1 to give 36 or can add Java is fun to make it a unique charac also = 36
        int I2 = s6.lastIndexOf("J");

        System.out.println(I2);//last j index number is J

        String s7 = "Java";
           int a1 =  s7.indexOf("A");//returns a neg number becuz it does not occur in string

        System.out.println(a1);// get -1

        String s8 = "Java";
        int a = s8.indexOf("a"); // change to double no pt since decimal so assign to int will not have to cast

       // char ch = s8.charAt((int)a);
        char ch = s8.charAt(a);

    }

    }