package day59_OOPReview;

import java.time.LocalDate;

public class Encapsulation {

    private int ssn;//12345
        //54321

    private final LocalDate Published = LocalDate.of(2020, 9, 8);

        public int getSSN(){
            return ssn;
        }
        public void setSsn(int ssn){
            this.ssn= ssn;
    }

    public LocalDate getPublished(){
            return Published;
    }

   // public void setPublished(LocalDate Published){this.Published = Published; }


}
