package builder;

import java.util.List;

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

    Student(StudentBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.studentId = builder.studentId;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
        this.email = builder.email;
        this.major = builder.major;
        this.minor = builder.minor;
        this.extracurricularActivities = builder.extracurricularActivities;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentId='" + studentId + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", major='" + major + '\'' +
                ", minor='" + minor + '\'' +
                ", extracurricularActivities=" + extracurricularActivities +
                '}';
    }
}
