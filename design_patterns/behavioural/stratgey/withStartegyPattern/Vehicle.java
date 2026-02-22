package behavioural.stratgey.withStartegyPattern;

import behavioural.stratgey.withStartegyPattern.strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
