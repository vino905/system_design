package builder;

import java.util.List;

public class StudentBuilder {
    String firstName;
    String lastName;
    String studentId;
    String address;
    String phoneNumber;
    String email;
    String major;
    String minor;
    List<String> extracurricularActivities;

    public StudentBuilder(String firstName, String lastName, String studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
    }

    public StudentBuilder address(String address) {
        this.address = address;
        return this;
    }

    public StudentBuilder phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public StudentBuilder email(String email) {
        this.email = email;
        return this;
    }

    public StudentBuilder major(String major) {
        this.major = major;
        return this;
    }

    public StudentBuilder minor(String minor) {
        this.minor = minor;
        return this;
    }

    public StudentBuilder extracurricularActivities(List<String> extracurricularActivities) {
        this.extracurricularActivities = extracurricularActivities;
        return this;
    }

    public Student build() {
        return new Student(this);
    }
}

