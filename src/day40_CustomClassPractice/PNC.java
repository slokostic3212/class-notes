package day40_CustomClassPractice;

public class PNC {

    String accountType;
    String accountHolder;
    String accountNumber;
    double balance;


    public void setAccountInfo(String accountType, String accountHolder, String accountNumber) { // sets the info
       this.accountType = accountType;
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }
}
