package day19_ForLoop;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class BreakStatement {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++ ){
            System.out.println("Hello");//printed 5x when i becomes 6 no execution
             break;                     //apply break to stop -  done in loop body and only 1 hello
        }
        System.out.println("============================================");

        for (char ch = 'A'; ch <= 'H'; ch++ ){// value of ch :A then B then C when it becomes C then break
                                                // statement get executed
            System.out.print(ch +" ");// apply break to forcefully exit loop

            if (ch =='C'){//statement is false so will continue // prints c before sout statement but if after
                                                    // it will bprint ABC
                break;
            }
            System.out.println(ch+" ");//A  location of break statement is important - top to bottom
        }

        System.out.println("=============================================");

        for (int i = 10; i <= 50; i += 10) {// i 10 20 30 40 50

            System.out.print(i + " ");// 30 also gets printed if break after sout
                                        // if sout after break then 30 will not get printed just 10 & 20
            if(i == 30){
               //break;
            }

            System.out.println();

            System.out.println("=====================================");

            for (int x = 1000; x >= 100; x -= 100){//x: 1000 900 800 700 600 500 400 300 200 100

                if (x == 500){// all would print if break not here  if after first cheks it then  prints
                                    //statement
                    break;
                }
                System.out.print(x+ " ");// 1000 900 800 700 600
            }
        }
    }


}
