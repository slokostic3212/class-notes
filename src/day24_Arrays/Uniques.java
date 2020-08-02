package day24_Arrays;
/*
1. write a program that can find the unique characters from a String

        Ex:
            input: aabccd
            output: bd
*/
public class Uniques {
    public static void main(String[] args) {
        String str = "aabcc";//first and last occurance of b == unique //chg to  aaabbbcccddeeefggg

        String uniques = "";// want to store uniq char from above string to this one this case is b

        for (int i = 0; i <= str.length()-1;i++) { // can remove -1 jsut remove = sign
            char ch = str.charAt(i);// a a b c c
                      //1st index      0 0 2 3 4
                      //last index     1 1 2 3 4
            int first = str.indexOf(ch);//returns occured char first index number b at index 2 = unique
            int last = str.lastIndexOf(ch);// last index number occured char - a occurs at index 0 & 1
                                            // not uniques
                                            // index of b = 2 is unique
            if ( first == last ){
                uniques += ch;// concat addition assignment
            }

        }
        System.out.println(uniques);// gives b as the unique one

    }

}
