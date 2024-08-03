package null_object;

public class VehicleFactory {


    static Vehicle getVehicleObject(String typeOfVehicle) {

        if (typeOfVehicle.equals("Car")) {
            return new Car();
        }
        return new NullObject();
    }
}
