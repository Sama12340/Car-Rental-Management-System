package crms;

/**
 * Agent class represents an employee (agent)
 * who manages car rental operations.
 */
public class Agent {

    // Unique identifier for the agent
    private String id;

    // Name of the agent
    private String name;

    /**
     * Constructor to initialize agent data
     *
     * @param id unique agent ID
     * @param name agent name
     */
    public Agent(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * @return agent ID
     */
    public String getId() {
        return id;
    }

    /**
     * @return agent name
     */
    public String getName() {
        return name;
    }

    /**
     * Updates agent name
     * @param name new name of the agent
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns agent details as a formatted string
     */
    @Override
    public String toString() {
        return "Agent ID: " + id + ", Name: " + name;
    }
}
