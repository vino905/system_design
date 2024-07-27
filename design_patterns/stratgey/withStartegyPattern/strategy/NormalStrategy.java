package stratgey.withStartegyPattern.strategy;

public class NormalStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Drive Capability");
    }
}
