package behavioural.stratgey.withStartegyPattern;

import behavioural.stratgey.withStartegyPattern.strategy.SpecialStrategy;

public class SportsVehicle extends Vehicle {

    SportsVehicle() {
        super(new SpecialStrategy());
    }
}
