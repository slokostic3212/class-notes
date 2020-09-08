package Office_Hours.Practice_09_08_2020;

public class Credentials {

    private String userName = "Cybertek";
    private String passWord = "Cybertek1234";

    public String getUserName(){// remove private to u can get getter chg to public
        return userName;
    }
    public void setUserName(String userName){//to modify the priate data we have
        this.userName = userName;

    }
}
