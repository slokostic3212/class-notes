package day47_Encapsulation;
/*
 create class credentials
		instance variable
			public namd
			public age
			private username
			private password

			getter & setter

			add a constructor to set name and age
 */

public class Credentials {

    public String name;
    public int age;
    public static String companyName;

    private String userName;
    private String passWord;

    static{
        companyName = "FaceBook";
    }

    public Credentials(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setPassWord(String passWord){
        this.passWord = passWord;
    }

    public String getUserName(){
        return userName;
    }

    public String getPassWord(){
        return passWord;
    }
}
