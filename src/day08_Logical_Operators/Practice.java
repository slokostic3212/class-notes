package day08_Logical_Operators;



public class Practice {
    public static void main(String[] args) {

    String firstName = "Slo";
    String lastName =  "Kostic'";

    int age = 19;
    String citizenShip = "USA";//change to china gives false

    boolean eligibleToVote = age >= 18 && citizenShip == "USA";

    //                        19 >= 18 && "China" == "USA
    //                           true        false =====>> returns false

        System.out.println(eligibleToVote);

        //new output is eligible to vote: true
        String fullName = firstName + " " + lastName;
        System.out.println(fullName + " is eligible to vote: "+ eligibleToVote);// true

        boolean r6 = !true && false; // false
        boolean r7 = !false && 9>8; // true


        // OR LOGIC == ||:

        boolean r8 = true == !false || false == true; // true

        System.out.println(r8);

        boolean r9 = !false == false || true == !false; //false if && used
        //              true == false   true == true

        boolean r10 = !false == false && true == !false;
        //              true == false && true == true


    }

}
