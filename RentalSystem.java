package crms;

import java.util.ArrayList;
import java.util.List;

// this class represents the rental system
public class RentalSystem {

    private List<Client> clients; // list of clients
    private List<Car> cars;       // list of cars
    private List<Agent> agents;   // list of agents

    // constructor to initialize the system with some clients, cars, and agents
    public RentalSystem(int numClients, int numCars, int numAgents) {

        clients = new ArrayList<>();
        cars = new ArrayList<>();
        agents = new ArrayList<>();

        String[] clientNames = {"Youssef", "Sama", "Hamza", "Mark", "Noura", "Omar"};
        String[] carModels = {"Toyota Corolla", "Hyundai Elantra", "Nissan Sunny", "Mitsubishi Lancer", "KIA Cerato"};
        String[] agentNames = {"Ayman", "Laila", "Karim", "Sara", "Mahmoud"};

        // create clients (Egyptian-style names)
        for (int i = 0; i < numClients; i++) {
            clients.add(new Client("C" + (i + 1), clientNames[i % clientNames.length]));
        }

        // create cars (realistic model names)
        for (int i = 0; i < numCars; i++) {
            cars.add(new Car("CAR" + (i + 1), carModels[i % carModels.length]));
        }

        // create agents (friendly human names)
        for (int i = 0; i < numAgents; i++) {
            agents.add(new Agent("A" + (i + 1), agentNames[i % agentNames.length]));
        }
    }

    // getter methods to access lists
    public List<Client> getClients() {
        return clients;
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Agent> getAgents() {
        return agents;
    }
}
