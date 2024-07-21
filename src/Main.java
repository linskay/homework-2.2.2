public class Main {
    public static void main(String[] args) {
        Transport car = new Car(4, "car1");
        Transport car2 = new Car(4, "car2");

        Transport truck = new Truck(6, "truck1");
        Transport truck2 = new Truck(8, "truck2");

        Transport bicycle = new Bicycle(2, "bicycle1");
        Transport bicycle2 = new Bicycle(2, "bicycle2");

        car.check();
        car2.check();
        bicycle.check();
        bicycle2.check();
        truck.check();
        truck2.check();
    }
}