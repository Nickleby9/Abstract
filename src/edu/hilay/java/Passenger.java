package edu.hilay.java;

/**
 * Created by Android2017 on 3/3/2017.
 */
public class Passenger{
    private String name;
    private double age;

    public Passenger() {
    }

    public Passenger(String name, double age) {
        this.name = name;
        this.age = age;
    }

    @Override //extends from Object class
    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }

    public double priceToPay(double basicTicketPrice) {
        return basicTicketPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
