package creational.prototype;

public class WelcomeEmail implements EmailTemplate {

    private String subject;
    private String content;

    public WelcomeEmail() {
        this.content = "Welcome to Riyad Net Banking";
        this.subject = "Hi there! Thanks for Showing interest";
    }

    @Override
    public EmailTemplate clone() {
        try {
            return (EmailTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void send(String to) {
        System.out.println("Sending to : -> " + to + ": [" + subject + "] " + content);
    }
}
