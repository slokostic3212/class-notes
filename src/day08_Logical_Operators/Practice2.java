package day08_Logical_Operators;

public class Practice2 {

    public static void main(String[] args) {
        String firstName = "Conor";
        String lastName = "McNugget";

        int age = 21 ;
        String citizen1 = "USA"; //turkish
        String citizen2 = "France";// russian still false cuz needs to = USA in bottome boolean

        boolean eligibleAge = age >= 18;
                            // 12 >= 18 ==> false
                            // 21           true

        boolean usCitizen = citizen1 == "USA" || citizen2 == "USA";

                            // "USA == "USA  || or France = = USA
                            //    true                false ==> true

        boolean eligibleToVote = eligibleAge && usCitizen;
                                // false  && true ==> ==> end logic false

        String fullName = firstName+ " "+lastName;

        System.out.println(fullName + " is eligible to vote for Trump:");// Conor McNugget is eligible to vote for Trump; false



    }
}
