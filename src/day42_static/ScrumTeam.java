package day42_static;
/*
 Attributes:
                            PO, BA, SM,
                            ArrayList<Tester> testers = new ArrayList<>(),
                            ArrayList<Developer> testers = new ArrayList<>(),

                    Actions:
                            setInfo(): sets the names of: PO, BA, SM

                            addTester(Tester tester): adds the given tester to the testers
                            arraylist

                            addTesters(Tester[] testers): adds the given testers to the testers
                            arraylist

                            addDeveloper(Developer developer): adds the given developer to the developers arraylist

                            addDevelopers(Developer[] developers): adds the given developers to the developers arraylist

                            removeTester(long employeeID): removes the given tester from the testers arraylist

                            removeDeveloper(long employeeID): removes the developer from the developers arraylist

 */
import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    ArrayList<Tester> testers = new ArrayList<>();
    ArrayList<Developer> developers = new ArrayList<>();
    String PO;
    String BA;
    String SM;

    public void setInfo( String PO, String BA, String SM){
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;

        /*
        team1 add tester only adds to the specific team 1 2 or 3 == need instance method
        team2
        team3
         */


    }
    public void addTester(Tester tester){// how do i add this tester to add arraylist = addmehtod
        testers.add(tester);

    }
    public void addTesters(Tester[] testers) {//if i remove s from addTesters mehtod overloading same name but diff parameters
    /*    //if(testers.length ==0){
        return;
    }

     */
        this.testers.addAll( Arrays.asList(testers));
    }
    public void removeTester(long employeeID){
        testers.removeIf( p -> p.employeeID == employeeID );//can also use this. keyword yet not recommended
                                            // this one cks ea employee id
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }
    public void addDeveloper(Developer[] developers){
        if(developers.length == 0){
            return;            //use this if no devs in list and exit this fxn
        }
        this.developers.addAll( Arrays.asList(developers) );
    }
    public void removeDeveloper(long employeeID){
        developers.removeIf( p -> p.employeeID == employeeID );// p = each dev object use p. to get obj name
    }
}
