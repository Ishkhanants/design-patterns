package creational.singleton;

import creational.singleton.ordinary.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance.toString());
        System.out.println(instance1.toString());
    }
}
