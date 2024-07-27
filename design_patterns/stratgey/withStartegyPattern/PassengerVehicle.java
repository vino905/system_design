package stratgey.withStartegyPattern;

import stratgey.withStartegyPattern.strategy.NormalStrategy;

public class PassengerVehicle extends Vehicle {
    PassengerVehicle() {
        super(new NormalStrategy());
    }
}
