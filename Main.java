package crms;

// main class to run the rental system
public class Main {

    public static void main(String[] args) {

        // testing part 1 classes with Egyptian style names
        Client client = new Client("C1", "Youssef");
        Car car = new Car("CAR1", "Toyota Corolla (Cairo)");
        Agent agent = new Agent("A1", "Sama");

        System.out.println("=== Egyptian Student Car Rental System ===");
        System.out.println("Welcome " + client.getName() + ", to the car rental system!");
        System.out.println(client);
        System.out.println(car);
        System.out.println(agent);

        // testing booking record from part 2 with Egyptian student sample data
        Client client2 = new Client("C2", "Hamza");
        Car car2 = new Car("CAR2", "Nissan Sunny");
        Agent agent2 = new Agent("A2", "Mark");

        BookingRecord booking = new BookingRecord(
                client2, car2, agent2,
                "2026-04-01", "2026-04-05", 500
        );

        System.out.println();
        System.out.println("=== Booking Record ===");
        System.out.println(booking);

        // testing rental system from part 2
        RentalSystem system = new RentalSystem(3, 5, 2);

        System.out.println();
        System.out.println("=== General Rental System Test ===");
        System.out.println("Clients: " + system.getClients());
        System.out.println("Cars: " + system.getCars());
        System.out.println("Agents: " + system.getAgents());
        System.out.println("Thank you for using the Egyptian student car rental system!");
    }
}
