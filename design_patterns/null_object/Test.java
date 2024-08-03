package null_object;

public class Test {
    public static void main(String[] args) {
        printVehicleDetails(VehicleFactory.getVehicleObject("Car"));
    }

    private static void printVehicleDetails(Vehicle vehicle) {
        System.out.println("Seating Capacity : " + vehicle.getSeatingCapacity());
        System.out.println("Tank Capacity : " + vehicle.getTankCapacity());
    }
}
