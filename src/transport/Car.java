package transport;

public class Car extends Transport{
    private static final Integer DEFAULT_WHEELS_COUNT = 4;
    public Car(String modelName) {
        super(modelName, DEFAULT_WHEELS_COUNT);
    }
    protected Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine(){
        System.out.println("  * Проверяем двигатель");
    }

    @Override
    public void check() {
        changeTyres();
        checkEngine();
    }
}
