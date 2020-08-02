package day25_Practices;

public class ShortestString{

    public static void main(String[] args) {

        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet"};

        int minLength = arr[0].length();// returns a string cannot assign to int = find lenth by calling
        //.length();
        // compare this length to each element to compare
        for (int i = 0; i <= arr.length - 1; i++) {
            int l = arr[i].length();
            if(l < minLength){
                minLength = l;
            }
        }
           /* int l = arr[i].length(); // 4 8  4 8 = length of names

            if (l < minLength) {
                minLength = l;


            }
        }

            */
            System.out.println(minLength);//4

            for (int i = 0; i <= arr.length - 1; i++) {
                if(arr[i].length() == minLength){
                    System.out.println(arr[i]);
                }

            }
        }
    }



