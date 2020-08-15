package day41_toString;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects2 {
    public static void main(String[] args) {

        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};
        //       0              1            2             3              4
        carpets[0].customOrder(4.5, 3.5, 17.5, false);
        carpets[1].customOrder(3.5, 3.5, 17.5, true);
        carpets[2].customOrder(6.5, 3.5, 19.5, false);
        carpets[3].customOrder(4.5, 3.5, 10.5, true);
        carpets[4].customOrder(5.5, 3.5, 11.5, true);



        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        persianCarpets.addAll(Arrays.asList(carpets));// here added all the carpets
        persianCarpets.removeIf( p -> !p.isPersian );// here remove carpets that are not persian
                                                        // no shows 3 which is correct
        ArrayList<Carpet> regularCarpets = new ArrayList<>();
        regularCarpets.addAll( Arrays.asList(carpets));
       // regularCarpets.removeIf( p -> p.isPersian);
        regularCarpets.removeAll( persianCarpets );

        System.out.println("number of persian carpets: "+persianCarpets.size());//says 5 which is false
        System.out.println("number of regular carpets: "+regularCarpets.size());

    }


}
