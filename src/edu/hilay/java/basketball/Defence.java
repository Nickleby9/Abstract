package edu.hilay.java.basketball;

import java.time.LocalDateTime;

/**
 * Created by Android2017 on 3/3/2017.
 */
public class Defence extends Player{
    private int numberOfBlocks;

    public Defence(String fName, int shirtNumber, LocalDateTime bDate, double height, int fromLinePercent, int fromFieldPercent, int numberOfBlocks) {
        super(fName, shirtNumber, bDate, height, fromLinePercent, fromFieldPercent);
        this.numberOfBlocks = numberOfBlocks;
    }

    public Defence(int numberOfBlocks) {
        this.numberOfBlocks = numberOfBlocks;
    }

    @Override
    public String toString() {
        return "Defence{" +
                "numberOfBlocks=" + numberOfBlocks +
                '}';
    }

    public int getNumberOfBlocks() {
        return numberOfBlocks;
    }
}
