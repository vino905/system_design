package stratgey.withStartegyPattern;


import stratgey.withStartegyPattern.strategy.NormalStrategy;

public class GoodsVehicle extends Vehicle {

    GoodsVehicle() {
        super(new NormalStrategy());
    }
}
