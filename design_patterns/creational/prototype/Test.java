package creational.prototype;

public class Test {
    public static void main(String[] args) {
        EmailTemplate welcomeMail1 = EmailTemplateRegistry.getEmailTemplate("welcome");
        welcomeMail1.setContent("Hi Vinod, Thanks for starting loan application");
        welcomeMail1.send("vinodkalwani2001@gmail.com");

        EmailTemplate welcomeMail2 = EmailTemplateRegistry.getEmailTemplate("welcome");
        welcomeMail2.setContent("Hi Prateek, Thanks for starting loan application");
        welcomeMail2.send("prateek2001@gmail.com");
    }
}
