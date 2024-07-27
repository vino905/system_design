package decorator;

public class CornTopping extends ToppingDecorator {

    BasePizza piizza;

    public CornTopping(BasePizza piizza) {
        this.piizza = piizza;
    }


    @Override
    public int cost() {
        return this.piizza.cost() + 10;
    }
}
