public class Car extends Transport {
    protected Car(int wheelsCount, String modelName) {
        super(wheelsCount, modelName);
    }

    public static void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void check() {
        super.check();
        checkEngine();
    }
}