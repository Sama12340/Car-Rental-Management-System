package crms;

/**
 * Agent class represents an employee in the rental system
 * who is responsible for handling bookings.
 */
public class Agent {

    // Unique ID for each agent
    private String id;

    // Name of the agent
    private String name;

    /**
     * Constructor to initialize agent information
     * @param id unique identifier for the agent
     * @param name name of the agent
     */
    public Agent(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Get the agent ID
     * @return agent ID
     */
    public String getId() {
        return id;
    }

    /**
     * Get the agent name
     * @return agent name
     */
    public String getName() {
        return name;
    }

    /**
     * Update the agent name
     * @param name new name of the agent
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Convert agent object to readable string
     */
    @Override
    public String toString() {
        return "Agent ID: " + id + ", Name: " + name;
    }
}
