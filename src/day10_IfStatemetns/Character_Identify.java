package day10_IfStatemetns;

public class Character_Identify {
    public static void main(String[] args) {

        char character = 'A';
        //                                      65<= character <= 98 in math logic not Java logic
        boolean isAlphabetic = (character >= 65 && character<= 90) || (character >= 97 & character<= 122);

        boolean isDigit = character >= 48 && character <= 57;
        //                       upper case letter         || lower case letter

        boolean specialChar = isAlphabetic == false &&  isDigit == false;
                //isAlphabetic && !isDigit;


        String alphabet = "";


        if(isAlphabetic) {
           // System.out.println(character + " is Alphabetic character");
            alphabet = character + " is Alphabetic character";
        }else{
          //  System.out.println(character + " is not Alphabetic chracter");// get 2 resp cuz nothing was declared
            alphabet = character + " is not 'Alphabetic character";
        }
        System.out.println(alphabet);

        String digit = "";
        if(isDigit == true){
            digit = character+ " is a digit";

        }else{
            digit = character+" is not a digit";

            System.out.println(digit);

            String specCharacter = "";
            if(specialChar == true){
                specCharacter = character+" is a special character";

            }else{
                specCharacter = character+" is not a special character";
            }
            System.out.println(specCharacter);
        }

    }
}
