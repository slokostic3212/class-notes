package Office_Hours.Practice_07_15_2020;

public class FrequencyOfWords {
    public static void main(String[] args) {// number of time removing Cat is num of freq

        String str = "dog dog dog ";//will cont to execute till all cats are emoved chg to dog from cat

        int count = 0;//var inc by 1 then 1st cat removed 1+1
        while(str.contains("dog")){//every time cat occurs in string count ++ // chg to while loop

                        // chg to dog = 1 first dog out 2 left  true 1 left 3rd exec count inc and 0 dogs
            count++;//
            str = str.replaceFirst("dog", "");// will replace all of the cats
                        // dog dog
                        // dog
                        // "" // this is waht string looks like boolean is false and it will not inc count anymore
        }
        //System.out.println(str);// 1 cat only
        //if(str.contains("cat")) {//every time cat occurs in string count ++
        //    count++;//
         //   str.replaceFirst("cat", "");// will replace all of the cats

        System.out.println(count);//8 now chn to 8 from orignil 2 // chg to dog and get 3 freq
        }
    }


