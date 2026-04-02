package crms;

/**
 * Main class used to run the Car Rental Management System (CRMS)
 */
public class Main {

    /**
     * Entry point of the program
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Create an instance of RentalSystem
        // Parameters:
        // 3 → number of clients
        // 5 → number of cars
        // 2 → number of agents
        RentalSystem system = new RentalSystem(3, 5, 2);

        // Display a message to confirm that the system has started successfully
        System.out.println("Car Rental Management System is running successfully!");

    }
}
