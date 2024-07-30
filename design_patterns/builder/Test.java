package builder;

public class Test {
    public static void main(String[] args) {
        Student student = new StudentBuilder("John", "Doe", "123456").address("123 Main St").phoneNumber("555-5555").email("john.doe@example.com").major("Computer Science").minor("Mathematics").build();
        System.out.println(student);
    }
}
