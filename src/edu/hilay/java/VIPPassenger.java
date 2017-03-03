package edu.hilay.java;

/**
 * Created by Android2017 on 3/3/2017.
 */
public class VIPPassenger extends Passenger {
    private double extraDiscount;

    public VIPPassenger() {
        //super(); //not must. auto integrated
    }

    public VIPPassenger(String name, double age, double extraDiscount) {
        super(name, age); //on every extends FIRST get super
        this.extraDiscount = extraDiscount;
    }

    @Override
    public double priceToPay(double basicTicketPrice) {
        double finalBasicTicket = super.priceToPay(basicTicketPrice);
        return finalBasicTicket - (finalBasicTicket * extraDiscount / 100);
    }

    @Override
    public String toString() {
        return super.toString() + "\nExtra Discount: " + extraDiscount + "%";
    }

    public double getExtraDiscount() {
        return extraDiscount;
    }

    public void setExtraDiscount(double extraDiscount) {
        this.extraDiscount = extraDiscount;
    }
}
