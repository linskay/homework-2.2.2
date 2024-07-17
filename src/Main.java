public class Main {
    public static void main(String[] args) {
        Transport car = new Car();
        Transport car2 = new Car();
        car.modelName = "car1";
        car2.modelName = "car2";
        car.wheelsCount = 4;
        car2.wheelsCount = 4;

        Transport truck = new Truck();
        Transport truck2 = new Truck();
        truck.modelName = "truck1";
        truck2.modelName = "truck2";
        truck.wheelsCount = 6;
        truck2.wheelsCount = 8;

        Transport bicycle = new Bicycle();
        Transport bicycle2 = new Bicycle();
        bicycle.modelName = "bicycle1";
        bicycle2.modelName = "bicycle2";
        bicycle.wheelsCount = 2;
        bicycle2.wheelsCount = 2;

        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(truck);
        station.check(truck2);
    }
}