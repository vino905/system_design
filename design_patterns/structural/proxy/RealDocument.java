package structural.proxy;

public class RealDocument implements Document {

    private final String content;

    public RealDocument(String content) {
        this.content = content;
    }

    @Override
    public void display() {
        System.out.println("Displaying ...." + content);
    }

    @Override
    public void edit() {
        System.out.println("Editing......" + content);
    }
}
