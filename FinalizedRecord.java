package crms;

// this class represents a finalized booking record
public class FinalizedRecord extends ProcessedRecord {

    private PaymentDetails paymentDetails; // payment information
    private PickupDetails pickupDetails;   // pickup information

    // constructor to initialize finalized record
    public FinalizedRecord(Client client, Car car, Agent agent,
                           String rentStart, String rentEnd, double cost,
                           InsuranceOption insuranceOption, Discount discount,
                           PaymentDetails paymentDetails, PickupDetails pickupDetails) {
        super(client, car, agent, rentStart, rentEnd, cost, insuranceOption, discount);
        this.paymentDetails = paymentDetails;
        this.pickupDetails = pickupDetails;
    }

    // getter methods
    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    public PickupDetails getPickupDetails() {
        return pickupDetails;
    }

    // setter methods
    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public void setPickupDetails(PickupDetails pickupDetails) {
        this.pickupDetails = pickupDetails;
    }

    // returns finalized record details as a string
    @Override
    public String toString() {
        return "FinalizedRecord ["
                + "Client=" + getClient()
                + ", Car=" + getCar()
                + ", Agent=" + getAgent()
                + ", Start=" + getRentStart()
                + ", End=" + getRentEnd()
                + ", Base Cost=" + getCost()
                + ", Insurance=" + getInsuranceOption()
                + ", Discount=" + getDiscount()
                + ", Final Cost=" + calculateProcessedCost()
                + ", Payment=" + paymentDetails
                + ", Pickup=" + pickupDetails
                + "]";
    }
}
