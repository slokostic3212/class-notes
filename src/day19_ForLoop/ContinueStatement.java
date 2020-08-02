package day19_ForLoop;

import java.util.function.DoubleToIntFunction;

public class ContinueStatement {
    public static void main(String[] args) {

        for(int i=1; i<=5; i++) {// i: 1 2 3 4 5

            if ( i == 3){
                continue;//if false then it will continue
                            // when conti statement gets executed it will go to next iteration so 3
                            // will not get printed - then jumps to 4 and will print 4 when it gets to 5
                            // it will print 5

            }
            System.out.print(i+" ");// prints for first time 1 then 2 then 4 then 5
        }

        System.out.println("=================================================");

        for (char ch = 'A'; ch <= 'F'; ch ++){//A B C D E F  i want to skip C so need to put conditon be4 sout

            if (ch == 'C' || ch == 'F' ){ /// give before other statements in loop get a b d e
                continue;
            }
            System.out.print(ch+" ");// C will be missing = if if statement be4 then will get c first
        }

        System.out.println();

    }
}
