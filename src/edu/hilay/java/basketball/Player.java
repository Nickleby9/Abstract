package edu.hilay.java.basketball;

import edu.hilay.java.utils.DateUtils;
import edu.hilay.java.utils.IO;
import edu.hilay.java.utils.RandomUtils;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Player {
    private String fName;
    private int shirtNumber;
    private LocalDateTime bDate;
    private double height;
    private int fromLinePercent;
    private int fromFieldPercent;

    public Player(String fName, int shirtNumber, LocalDateTime bDate, double height, int fromLinePercent, int fromFieldPercent) {
        this.fName = fName;
        this.shirtNumber = shirtNumber;
        this.bDate = bDate;
        this.height = height;
        this.fromLinePercent = fromLinePercent;
        this.fromFieldPercent = fromFieldPercent;
    }

    public Player() {
        fName = IO.getString("Enter first name: ");
        this.shirtNumber = IO.getInt("Enter shirt number: ");
        this.bDate = LocalDateTime.of(1993, 9, 26, 0, 0);
        this.height = IO.getDouble("Enter height: ");
        fromLinePercent = IO.getInt("Enter percent from line: ");
        fromFieldPercent = IO.getInt("Enter percent from field: ");
    }

    @Override
    public String toString() {
        return "Player{" +
                "fName='" + fName + '\'' +
                ", shirtNumber=" + shirtNumber +
                ", bDate=" + bDate +
                ", height=" + height +
                ", fromLinePercent=" + fromLinePercent +
                ", fromFieldPercent=" + fromFieldPercent +
                '}';
    }

    public double getAge() {
        return DateUtils.differenceInYears(LocalDateTime.now(), bDate);
    }

    public boolean throwFromLine(int percent) {
        int score = RandomUtils.nextRandom(1, 100);
        if (score <= percent) {
            return true;
        } else {
            return false;
        }
    }

    public boolean throwFromField(int percent) {
        int score = RandomUtils.nextRandom(1, 100);
        if (score <= percent) {
            return true;
        } else {
            return false;
        }
    }

    public void ball() {
        System.out.println("*Bowling...*");
    }

    public int getFromLinePercent() {
        return fromLinePercent;
    }

    public int getFromFieldPercent() {
        return fromFieldPercent;
    }
}
