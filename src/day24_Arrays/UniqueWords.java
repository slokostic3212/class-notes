package day24_Arrays;

public class UniqueWords {
    public static void main(String[] args) {
        String[] words = {"c#", "C#", "Java", "Python", "Python", "C++"};

        for(int j = 0; j <= words.length-1; j++){

            String s = words[j];
            int count = 0;// declare this variable to store the freq of s to this variable
            for (int i = 0; i <= words.length-1; i++) {
                String each = words[i];// if s matches w each then count
                if (s.equals(each)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(s);//

            }

       /* String s = words[0];
        int count = 0;// declare this variable to store the freq of s to this variable
        for (int i = 0; words.length-1; i++){
            String each = words[i];// if s matches w each then count
            if(s.equals(each)){
                count++;
            }
        }
        if(count == 1){
            System.out.println(s);//
        }
*/
        }
    }
}
