package day52_Exceptions;

import java.util.NoSuchElementException;

public class MultiCatchBlock {

    public static void main(String[] args) {

        int[] arr = {10,20};

        try {

            System.out.println(arr[20]);// arrayindexoutofbound

        } catch (ArithmeticException e) {
            System.out.println("arithmetic exception is handled");
        }catch (ClassCastException e){
            System.out.println("class cast exception");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array index out of bound exception");
        }catch (IndexOutOfBoundsException e) {
            System.out.println("index out of bound exception");//
        }catch (RuntimeException e){
            System.out.println("run time exception");
        }//catch (NoSuchElementException e){
        System.out.println("====================================");

        String  str = "Cybertek";
        try {

            System.out.println(str.charAt(200));// unckd occurs during runtium
        }catch(RuntimeException e){// can handle any uncked exception
            System.out.println(e.getMessage());
        }

        System.out.println("========================");
        try{

        Thread.sleep(3000);

        }catch(InterruptedException e) {
        }
        System.out.println("completed");
        }

    }

