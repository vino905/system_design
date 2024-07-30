

## Builder Design Pattern

The Builder Design Pattern is a creational design pattern that provides a way to construct complex objects step-by-step. Unlike other creational patterns, it allows you to produce different types and representations of an object using the same construction process.



# Student Registration System

This project demonstrates the use of the Builder Design Pattern to create a `Student` object with optional parameters. The Builder Design Pattern is particularly useful when dealing with complex objects that have numerous optional parameters.

### Example Scenario without Builder Design Pattern

Without the Builder Design Pattern, creating an object with numerous optional parameters can lead to code that is hard to read and maintain. Typically, this is addressed by creating multiple constructors, known as telescoping constructors, or by using setter methods. Both approaches have their drawbacks:

1. **Telescoping Constructors**:
    ```java
    public class Student {
        private String firstName;
        private String lastName;
        private String studentId;
        private String address;
        private String phoneNumber;
        private String email;
        private String major;
        private String minor;
        private List<String> extracurricularActivities;
        
        public Student(String firstName, String lastName, String studentId) {
            this(firstName, lastName, studentId, null, null, null, null, null, null);
        }
        
        public Student(String firstName, String lastName, String studentId, String address) {
            this(firstName, lastName, studentId, address, null, null, null, null, null);
        }

        // Additional constructors...
    }
    ```
   The telescoping constructor pattern can be unwieldy, as the number of constructors grows exponentially with the number of parameters.

2. **Setter Methods**:
    ```java
    Student student = new Student();
    student.setFirstName("John");
    student.setLastName("Doe");
    student.setStudentId("123456");
    student.setAddress("123 Main St");
    // Additional setters...
    ```
   Using setters results in code that is less readable and allows for the creation of an incomplete or inconsistent object.

## Using the Builder Design Pattern

The Builder Design Pattern addresses these issues by providing a flexible and readable way to create objects. Example code is located in a `factory` directory:











