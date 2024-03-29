package creational.singleton.ordinary;

public class Singleton  {
    public static final Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance(){
        return instance;
    }
}
