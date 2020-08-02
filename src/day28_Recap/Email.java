package day28_Recap;
/*
3. write a program that can get the name and domain of any given email address
        Ex:
            cybertek@gmail.com
            output:
                name: cybertek
                domain: gmail

 */
public class Email {
    public static void main(String[] args) {

        String email = "cybertek.school@gmail.com";// cg to .school

        String name = email.substring(0, email.indexOf("@"))  ;// get all info before @
        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));

        System.out.println(name);//name bef @
        System.out.println(domain);// info bef .com

    }


}
