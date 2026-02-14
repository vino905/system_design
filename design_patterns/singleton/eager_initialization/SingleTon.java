package singleton.eager_initialization;

public class SingleTon {

    private static final SingleTon obj = new SingleTon();

    private SingleTon() {
    }

    public static SingleTon getInstance() {
        return obj;
    }
}
