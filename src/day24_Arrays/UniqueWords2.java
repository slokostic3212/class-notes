package day24_Arrays;

public class UniqueWords2 {
    public static void main(String[] args) {
        String[] words = {"c#", "C#", "Java", "Python", "Python", "C++", "Ruby"};

        String each = words[0];//chg s to each
        int count = 0;

        for (String b : words) {//reps each element in array words
            if (each.equals(b)) {// chg s to each
                count++;
            }

        }
        if (count == 1) {
            System.out.println(each);//chg s to each

        }


    }

}



