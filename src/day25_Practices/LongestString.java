package day25_Practices;

public class LongestString {
    public static void main(String[] args) {
        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet", "Geerrrttmmb", "Kofrorororororororooro"};// for ea loop to get access to elements
                                                                 // from variable

        int maxlength = arr[0].length(); //4

        for (String each : arr){// each loop for finding max length
            if( each.length() > maxlength){
                maxlength = each.length();
            }
        }
        //System.out.println(maxlength);// max length of string = 8

        for (String each : arr){
            if(each.length() == maxlength){
                maxlength = each.length();
            }



        }
        System.out.println(maxlength);
    }
}
