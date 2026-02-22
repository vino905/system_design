## Null Object Pattern

The `Null Object Pattern` is a design pattern that provides a way to handle the absence of an object by using a
surrogate object that implements the same interface but does nothing. This pattern helps avoid `null` checks in the code
and simplifies the handling of optional behavior.

## Example: Vehicle System

This example demonstrates the Null Object Pattern through a simple vehicle system implemented in Java. The system
includes a `Vehicle` interface, a `Car` class, a `NullObject` class, a `VehicleFactory` to create vehicle instances, and
a `Test` class to showcase usage.

### Code Explanation

- **Vehicle Interface:** Defines methods `getSeatingCapacity()` and `getTankCapacity()` that must be implemented by any
  vehicle class.
- **Car Class:** Implements the `Vehicle` interface with specific values for seating and tank capacity.
- **NullObject Class:** Implements the `Vehicle` interface but provides default values (0) for both methods,
  representing a "no-operation" or "default" vehicle.
- **VehicleFactory Class:** Contains a static method `getVehicleObject(String typeOfVehicle)` that returns a `Car` if
  the type is `"Car"`; otherwise, it returns a `NullObject`.
- **Test Class:** Demonstrates the usage of `VehicleFactory` to obtain a `Vehicle` object and prints its details. The
  use of `NullObject` eliminates the need for null checks in `printVehicleDetails()`, ensuring cleaner and more
  maintainable code.

