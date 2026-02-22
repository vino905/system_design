package behavioural.stratgey.withStartegyPattern;


import behavioural.stratgey.withStartegyPattern.strategy.NormalStrategy;

public class GoodsVehicle extends Vehicle {

    GoodsVehicle() {
        super(new NormalStrategy());
    }
}
