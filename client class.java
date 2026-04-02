package crms;

/**
 * Client class represents a customer
 * who rents cars from the system.
 */
public class Client {

    // Unique ID for each client
    private String id;

    // Name of the client
    private String name;

    /**
     * Constructor to initialize client data
     * @param id unique identifier for the client
     * @param name name of the client
     */
    public Client(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Get client ID
     * @return client ID
     */
    public String getId() {
        return id;
    }

    /**
     * Get client name
     * @return client name
     */
    public String getName() {
        return name;
    }

    /**
     * Update client name
     * @param name new name of the client
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Convert client object to readable string
     */
    @Override
    public String toString() {
        return "Client ID: " + id + ", Name: " + name;
    }
}
