package behavioural.stratgey.withStartegyPattern;

import behavioural.stratgey.withStartegyPattern.strategy.NormalStrategy;

public class PassengerVehicle extends Vehicle {
    PassengerVehicle() {
        super(new NormalStrategy());
    }
}
