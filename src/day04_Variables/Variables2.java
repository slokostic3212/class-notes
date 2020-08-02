package day04_Variables;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Variables2 {

    public static void main(String[] args){

        char ch1 = 'A';
        char ch2 = 65;

        System.out.println(ch1);
        System.out.println(ch2);

        char ch3 = 35000;

        System.out.println(ch3);

        //char ch4 = '65000'
        char ch5 = 56879;
        System.out.println(ch5);

        char c1 = 'A';// 65
        char c2 = 'B';// 66 =131

        System.out.println(c1 + c2  );

        int result = c1 + c2; // = 131

        System.out.println(result);

        double d = c1 + c2;

        System.out.println(d); //131.0

        int num1 = 'A';
        System.out.println(num1);// give you number of character A

        char c4 = 65+45; // 110
        System.out.println(c4); //give you character of number 65+45

        char c5 = 'Z';
        char c6 = 897;

        System.out.println(c6);// gave a square

        char c7 = '1'; //49

        System.out.println(c7); // char: '1"
        //                 '1' + 1 = 50

        // addition not applied to char

        //character 1 = number 49

            int r1 = c7; // 49
        System.out.println(r1);

        char charz = 'Z';
        System.out.println(charz);

        int count = 100;
        System.out.println(count);


        System.out.println("======================");

        char a1 = 'A';// - 65
        System.out.println(a1);

        int n1 = 'A' + 2;// 67
        System.out.println(n1);

        char a2 = '@';// 64
        char a3 = 64;

        System.out.println(a2);
        System.out.println(a3);

        System.out.println( '@' + 2);//66



    }




}
