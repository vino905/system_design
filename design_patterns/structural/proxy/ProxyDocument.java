package structural.proxy;

public class ProxyDocument implements Document {

    private RealDocument realDocument;
    private String userRole;

    public ProxyDocument(String content, String userRole) {
        this.realDocument = new RealDocument(content);
        this.userRole = userRole;
    }

    @Override
    public void display() {
        realDocument.display();
    }

    @Override
    public void edit() {
        if ("ADMIN".equals(userRole)) {
            realDocument.edit();  // Allow only admin users to edit
        } else {
            System.out.println("Access denied: You do not have permission to edit this document.");
        }
    }
}
