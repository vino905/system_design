package decorator;

public class Test {
    public static void main(String[] args) {
        BasePizza piizza = new CornTopping(new ExtraCheeseTopping(new Farmhouse()));
        System.out.println("Cost Of Pizza : " + piizza.cost());
    }
}
