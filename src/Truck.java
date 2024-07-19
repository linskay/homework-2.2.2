public class Truck extends Transport {
    protected Truck(int wheelsCount, String modelName) {
        super(wheelsCount, modelName);
    }

    @Override
    public void check() {
        super.check();
        checkTrailer();
    }

    public static void checkTrailer() {
        Car.checkEngine();
        System.out.println("Проверяем прицеп");
    }
}