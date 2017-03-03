package edu.hilay.java.basketball;

import edu.hilay.java.utils.RandomUtils;

import java.time.LocalDateTime;

/**
 * Created by Android2017 on 3/3/2017.
 */
public class Attack extends Player {
    private int numberOfOffence;

    public Attack(String fName, int shirtNumber, LocalDateTime bDate, double height, int fromLinePercent, int fromFieldPercent, int numberOfOffence) {
        super(fName, shirtNumber, bDate, height, fromLinePercent, fromFieldPercent);
        this.numberOfOffence = numberOfOffence;
    }

    public Attack(int numberOfOffence) {
        this.numberOfOffence = numberOfOffence;
    }

    @Override
    public String toString() {
        return "Attack{" +
                "numberOfOffence=" + numberOfOffence +
                '}';
    }

    public int getNumberOfOffence() {
        return numberOfOffence;
    }
}
