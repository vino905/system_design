package decorator;

public class ExtraCheeseTopping extends ToppingDecorator {

    BasePizza pizza;

    public ExtraCheeseTopping(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 20;
    }
}
