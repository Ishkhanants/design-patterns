package creational.builder;

/**
 * @author Martin Mirzoyan
 */

public class Worker {
    private String passport; // required
    private String firstName;
    private String lastName;
    private int year;
    private String address;
    private int phone;

    private Worker(WorkerBuilder builder){
        passport = builder.passport;
        lastName = builder.lastName;
        firstName = builder.firstName;
        year = builder.year;
        phone = builder.phone;
        address = builder.address;
    }

    public String getPassport() {
        return passport;
    }

    public static class WorkerBuilder {
        private String passport; // required
        private String firstName;
        private String lastName;
        private int year;
        private String address;
        private int phone;

        public WorkerBuilder(String passport) {
            this.passport = passport;
        }

        public WorkerBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public WorkerBuilder address(String address){
            this.address = address;
            return this;
        }

        public WorkerBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public WorkerBuilder year(int year){
            this.year = year;
            return this;
        }

        public WorkerBuilder phone(int phone){
            this.phone = phone;
            return this;
        }

        public Worker build(){
            return new Worker(this);
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYear() {
        return year;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone() {
        return phone;
    }
}