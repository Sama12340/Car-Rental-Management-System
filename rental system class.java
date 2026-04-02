package crms;

import java.util.ArrayList;
import java.util.List;

/**
 * RentalSystem class represents the main system
 * that manages clients, cars, and agents.
 */
public class RentalSystem {

    // List to store all clients in the system
    private List<Client> clients;

    // List to store all cars in the system
    private List<Car> cars;

    // List to store all agents in the system
    private List<Agent> agents;

    /**
     * Constructor to initialize the system with a given number
     * of clients, cars, and agents.
     *
     * @param numClients number of clients to be created
     * @param numCars number of cars to be created
     * @param numAgents number of agents to be created
     */
    public RentalSystem(int numClients, int numCars, int numAgents) {

        // Initialize lists
        clients = new ArrayList<>();
        cars = new ArrayList<>();
        agents = new ArrayList<>();

        // Create and add clients to the list
        for (int i = 0; i < numClients; i++) {
            clients.add(new Client("C" + i, "Client" + i));
        }

        // Create and add cars to the list
        for (int i = 0; i < numCars; i++) {
            cars.add(new Car("CAR" + i, "Model" + i));
        }

        // Create and add agents to the list
        for (int i = 0; i < numAgents; i++) {
            agents.add(new Agent("A" + i, "Agent" + i));
        }
    }

    /**
     * Returns the list of clients
     * @return list of clients
     */
    public List<Client> getClients() {
        return clients;
    }

    /**
     * Returns the list of cars
     * @return list of cars
     */
    public List<Car> getCars() {
        return cars;
    }

    /**
     * Returns the list of agents
     * @return list of agents
     */
    public List<Agent> getAgents() {
        return agents;
    }
}
