package transport;

public abstract class Transport implements Checkable{
    private String modelName;
    private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public void changeTyres(){
        for (int i = 0; i < wheelsCount; i++) {
            System.out.println("  * Меняем покрышку " + (i + 1));
        }
    }
}
