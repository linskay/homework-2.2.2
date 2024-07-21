public abstract class Transport implements TransportForService {
    private String modelName;
    private int wheelsCount;

    public Transport(int wheelsCount, String modelName) {
        this.wheelsCount = wheelsCount;
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int i = 0; i < this.getWheelsCount(); i++) {
            this.updateTyre();
        }
    }
}

