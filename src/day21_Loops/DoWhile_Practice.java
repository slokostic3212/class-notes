package day21_Loops;

public class DoWhile_Practice {

    public static void main(String[] args) {

        int num = 1;// our starting pt


        do{

            System.out.print(num +" ");// no \n in this it will executed 20 xs
            num++;// after statement - pritns it first then iterates it
                    // if before statement - you have iterator of num so inter will get increated by 1 ==2
                    // starts from 2 then
            //*** best to be after statements

        }while(num  <= 20);// iterator gets at end of statement chg to >20 giving you 1 // condition is false
                            // so above code fragments will not get executed

        System.out.println();// appends a new line

        System.out.println("==============================");

        char ch = 'Z';
        do{
            System.out.print(ch+" ");// alpha backwards
            ch--;
        }while(ch >= 'A');

    }
}
