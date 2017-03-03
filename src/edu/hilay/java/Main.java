package edu.hilay.java;

import edu.hilay.java.basketball.Attack;
import edu.hilay.java.basketball.Player;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Player p = new Player("Moshe", "Cohen", 70, 33);

        if (p.throwFromLine(p.getFromLinePercent()) == true) {
            System.out.println("From Line - Success!");
        } else {
            System.out.println("From Line - Failed!");
        }

        if (p.throwFromField(p.getFromFieldPercent()) == true) {
            System.out.println("From Field - Success!");
        } else
            System.out.println("From Field - Failed!");


        /*
        VIPPassenger p = new VIPPassenger("Dave", 22, 20);
        double priceToPay = p.priceToPay(100);

//        System.out.println(p.toString());
//        System.out.println("Final VIP price is: " + priceToPay);

        ArrayList<Passenger> passengers = new ArrayList<>();
        passengers.add (p);

        System.out.println(passengers);
        */

    }

}
