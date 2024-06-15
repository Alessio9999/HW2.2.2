package transport;

public class ServiceStation {

    public void check(Transport[] transports) {
        for (Transport transport : transports) {
            check(transport);
        }
    }

    public void check(Transport transport) {
        if (transport != null) {
            System.out.println("\nКатегория ТС: " + transport.getClass().getSimpleName());
            System.out.println("Марка ТС: " + transport.getModelName());
            System.out.println("Количество колёс: " + transport.getWheelsCount());
            System.out.println("Выполняем техобслуживание: ");
            transport.check();
        } else
            System.out.println(TextColors.ANSI_RED + "\nОшибка! Объект 'transport' должен быть инициализирован!" + TextColors.ANSI_RESET);
    }
}
