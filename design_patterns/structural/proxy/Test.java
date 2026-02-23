package structural.proxy;

public class Test {
    public static void main(String[] args) {
        // Admin user
        Document adminDocument = new ProxyDocument("Admin Document", "ADMIN");
        adminDocument.display();
        adminDocument.edit();  // Admin can edit

        // normal user
        Document userDocument = new ProxyDocument("User Document", "USER");
        userDocument.display();
        userDocument.edit();
    }
}
