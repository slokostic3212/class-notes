package day34_WrapperClasses;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
1. use the LocalDate and Time get the current date and time in the following format:

			Sunday, 10:28 AM, Jul/26/2020
 */
public class warmup {

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE, hh:mm a, MMM/dd/yyyy"); // EEEE means full name
                                                        // sunday 10:28AM, Jul/26/2020

        LocalDateTime today = LocalDateTime.now();

        System.out.println(today);//2020-07-26T10:32:13.487

        System.out.println( today.format(dtf));//Sun, 10:34 AM, Jul/26/2020
    }

}
