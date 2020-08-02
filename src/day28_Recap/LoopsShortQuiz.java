package day28_Recap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class LoopsShortQuiz {

    public static void main(String[] args) {

        int a =0 ;
        while (a <= 6){// true a = 2 true a =4 true a = 6 true a= 8 flse
            a += 2;
        }
        System.out.println(a);

        int i = 0;
        int j = 7;
        //                  6
        for (int b = 1; b < j-1; b += 2){//i: 0 2 4 6
            // compiler cks condi then statemet
            System.out.println(b +" ");// 0 2 4 fals 6 will not be p rinted

        }
        System.out.println();
        System.out.println(i);//6

        for (int k = 0; k <= 4; ){
          //  k++;// k: 1 2 3 4
            System.out.println(k);// 1 2 3 4 5 loop executes 5 times

            k++; // if after print statement - get 0 1 2 3 4 5
            // imp location of iterator
        }
        System.out.println();

        int z = 5; // 5+5+4+3+2+1 = 20
        for(int q = 5; q > 0; q-- ){// q: 5 4 3 2 1
            z += q;
        }
    }
}
