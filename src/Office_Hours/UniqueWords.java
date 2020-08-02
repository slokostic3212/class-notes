package Office_Hours;

public class UniqueWords {
    public static void main(String[] args) {
        String[] words = {"C#", "C#", "Python", "Java", "C#"};//add xtr c#
        //                   0      1       2       4     5


        for (String b : words) {
           // String s = words[0];//"C#"
            int count = 0;

            for (String a : words) {// when a is same as s == inc by 1
                if (a.equals(b)) {
                    count++;
                }

            }
            if (count == 1) {// chg to 2 if want words printed twice
                System.out.println(b);// not print not unique
            }
            //System.out.println(count);//gives 2 give 3
        }
    }
}
