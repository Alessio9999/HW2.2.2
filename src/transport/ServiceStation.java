package transport;

public class ServiceStation {
    private Transport[] transports;

    public ServiceStation(Transport[] transports) {
        this.transports = transports;
    }

    public void checkAll(){
        for (Transport transport : transports) {
            System.out.println("\nКатегория ТС: " + transport.getClass().getSimpleName());
            System.out.println("Марка ТС: " + transport.getModelName());
            System.out.println("Количество колёс: " + transport.getWheelsCount());
            System.out.println("Выполняем техобслуживание: ");
            transport.check();
        }
    }
}
