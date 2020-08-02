package day12_Switch_Scanner;
/* write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                  age cannot be negative or greater than 150


		NOTE: MUST APPLY NESTED IF

 */

public class AgeGroups {

    public static void main(String[] args) {
        int age = 170;
        String ageGroup = "";

        if(age > 0 && age <= 150){
        /*    if(age > 0 && age <21){ // can take out age > 0 can be taken out cuz it was specified above
                ageGroup = "Teenage";// take out age >= 21
            }else if (age <= 55){
                ageGroup = "ADult";
            }else{
                ageGroup = "Senior";
            }
*/
        ageGroup = (age <21) ? "Teenage" : (age <= 55) ? "Adult" : "Senior";

        }else{                        // this else block is opp of precond if (age > 0
            ageGroup = "Invalid";
        }
        System.out.println(ageGroup);
    }
}
