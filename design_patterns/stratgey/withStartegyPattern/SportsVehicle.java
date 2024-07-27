package stratgey.withStartegyPattern;

import stratgey.withStartegyPattern.strategy.SpecialStrategy;

public class SportsVehicle extends Vehicle {

    SportsVehicle() {
        super(new SpecialStrategy());
    }
}
