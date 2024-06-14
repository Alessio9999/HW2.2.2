import transport.*;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Welt", 2);
        Car car = new Car("Mercedes-Benz");
        Truck truck = new Truck("Ford", 8);

        Transport[] transports = new Transport[]{bicycle, car, truck};
        ServiceStation serviceStation = new ServiceStation(transports);
        serviceStation.checkAll();
    }
}