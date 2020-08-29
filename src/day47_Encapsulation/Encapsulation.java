package day47_Encapsulation;

public class Encapsulation {

    private long ssn = 1234567;

    public long getSsn(){       // read only  can use any acc mods -
        return ssn;

    }

    public void setSsn(long ssn){
        this.ssn = ssn;

    }

}
