package singleton.lazy_initialization;

public class SingleTon {
    private static SingleTon obj;

    private SingleTon() {
    }

    public static SingleTon getInstance() {
        if (obj == null) {
            obj = new SingleTon();
        }
        return obj;
    }
}
