package creational.prototype;

public interface EmailTemplate extends Cloneable {

    EmailTemplate clone(); // Make sure we are performing deep copy

    void setContent(String content);

    void send(String to);
}
