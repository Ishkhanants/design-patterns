package creational.builder;

/**
 * @author Martin Mirzoyan
 */

public class Main {
    public static void main(String[] args) {
        Worker ww = new Worker.WorkerBuilder("AT5465465")
                .address("Address 21")
                .firstName("Hayk")
                .lastName("Aramyan")
                .phone(1231321)
                .build();

        System.out.println("Hello new worker: " + ww.getFirstName());
    }
}