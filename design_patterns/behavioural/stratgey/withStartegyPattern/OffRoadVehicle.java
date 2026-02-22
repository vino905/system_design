package behavioural.stratgey.withStartegyPattern;

import behavioural.stratgey.withStartegyPattern.strategy.SpecialStrategy;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle() {
        super(new SpecialStrategy());
    }
}
