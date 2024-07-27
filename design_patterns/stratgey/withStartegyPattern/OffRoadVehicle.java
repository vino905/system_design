package stratgey.withStartegyPattern;

import stratgey.withStartegyPattern.strategy.SpecialStrategy;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle() {
        super(new SpecialStrategy());
    }
}
