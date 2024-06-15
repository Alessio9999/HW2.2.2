import transport.*;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Welt", 2);
        Car car = new Car("Mercedes-Benz");
        Truck truck = new Truck("Ford", 8);

        Transport[] transports = new Transport[]{bicycle, car, truck};
        ServiceStation serviceStation = new ServiceStation();
        System.out.println("\nПроверяем одно из транспортных средств:");
        serviceStation.check(transports[0]);
        System.out.println("\nПроверяем ВСЕ транспортные средства:");
        serviceStation.check(transports);
        System.out.println("\nПробуем проверить ТС, объект (transport) которого равен 'null': ");
        transports[0] = null;
        serviceStation.check(transports[0]);
    }
}