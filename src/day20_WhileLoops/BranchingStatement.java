package day20_WhileLoops;

public class BranchingStatement {

    public static void main(String[] args) {

        /*char ch = 'A';
        while (ch <= 'E') {
            if (ch == 'C') {
                ch++;
                continue;//skips everything ever iterator
            }

            System.out.println(ch);// A B D E
            ch++;//iterator also skipped // iterator before continue so this one is skipped

        }
        */
        boolean a = true;
        while (a){
            System.out.println("Test started");
            //break;// terminates the loop only not the system
            System.exit(0);// everything gets terminated == 
        }
        //System.out.println("Completed");
    }
}
