package day25_Practices;

public class ShortestString2 {
    public static void main(String[] args) {
        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet", "Tony", "Adam", "Musa", "Alan"};//no of
                                                            // elements not imp cuz it counts index

        int minLength = arr[0].length();// returns a string cannot assign to int = find lenth by calling
                                        //.length();
                                        // compare this length to each element to compare
        for (String each : arr) {// to find out the min lenght of the string in an arr  // convert to for each loop
            int l = each.length();// chg arr[i} to each
            //if(l < minLength){// assign to bottom variable
                minLength = each.length();//chg l to each.lenth()
            }
        }
           /* int l = arr[i].length(); // 4 8  4 8 = length of names

            if (l < minLength) {
                minLength = l;


            }
        }

            */
        //System.out.println(minLength);//4

        //for (String each : arr) {// chg to each from for loop
         //   if(each.length() == minLength){ //give var itself == each
         //       System.out.println(each);
            }






