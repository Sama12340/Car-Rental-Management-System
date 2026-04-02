package crms;

/**
 * BookingRecord class represents a single booking transaction
 * in the Car Rental Management System.
 */
public class BookingRecord {

    // The client who rents the car
    private Client client;

    // The car being rented
    private Car car;

    // The agent responsible for handling the booking
    private Agent agent;

    // Rental start date
    private String rentStart;

    // Rental end date
    private String rentEnd;

    // Total cost of the booking
    private double cost;

    /**
     * Constructor to initialize a booking record
     *
     * @param client the client who rents the car
     * @param car the rented car
     * @param agent the agent handling the booking
     * @param rentStart start date of rental
     * @param rentEnd end date of rental
     * @param cost total cost of rental
     */
    public BookingRecord(Client client, Car car, Agent agent,
                         String rentStart, String rentEnd, double cost) {
        this.client = client;
        this.car = car;
        this.agent = agent;
        this.rentStart = rentStart;
        this.rentEnd = rentEnd;
        this.cost = cost;
    }

    /**
     * @return client information
     */
    public Client getClient() {
        return client;
    }

    /**
     * @return car information
     */
    public Car getCar() {
        return car;
    }

    /**
     * @return agent information
     */
    public Agent getAgent() {
        return agent;
    }

    /**
     * @return rental start date
     */
    public String getRentStart() {
        return rentStart;
    }

    /**
     * @return rental end date
     */
    public String getRentEnd() {
        return rentEnd;
    }

    /**
     * @return total cost of booking
     */
    public double getCost() {
        return cost;
    }

    /**
     * Update the rental end date
     * @param rentEnd new end date
     */
    public void setRentEnd(String rentEnd) {
        this.rentEnd = rentEnd;
    }

    /**
     * Update the total cost
     * @param cost new cost value
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * Returns booking details as a formatted string
     */
    @Override
    public String toString() {
        return "BookingRecord [Client=" + client +
               ", Car=" + car +
               ", Agent=" + agent +
               ", Start=" + rentStart +
               ", End=" + rentEnd +
               ", Cost=" + cost + "]";
    }
}
