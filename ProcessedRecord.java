package crms;

// this class represents a processed booking record
public class ProcessedRecord extends BookingRecord {

    private InsuranceOption insuranceOption; // insurance applied to booking
    private Discount discount;               // discount applied to booking

    // constructor to initialize processed record
    public ProcessedRecord(Client client, Car car, Agent agent,
                           String rentStart, String rentEnd, double cost,
                           InsuranceOption insuranceOption, Discount discount) {
        super(client, car, agent, rentStart, rentEnd, cost);
        this.insuranceOption = insuranceOption;
        this.discount = discount;
    }

    // getter methods
    public InsuranceOption getInsuranceOption() {
        return insuranceOption;
    }

    public Discount getDiscount() {
        return discount;
    }

    // setter methods
    public void setInsuranceOption(InsuranceOption insuranceOption) {
        this.insuranceOption = insuranceOption;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    // calculate final cost after adding insurance and subtracting discount
    public double calculateProcessedCost() {
        double finalCost = getCost();

        if (insuranceOption != null) {
            finalCost += insuranceOption.getPrice();
        }

        if (discount != null) {
            finalCost -= discount.getAmount();
        }

        return finalCost;
    }

    // returns processed record details as a string
    @Override
    public String toString() {
        return "ProcessedRecord ["
                + "Client=" + getClient()
                + ", Car=" + getCar()
                + ", Agent=" + getAgent()
                + ", Start=" + getRentStart()
                + ", End=" + getRentEnd()
                + ", Base Cost=" + getCost()
                + ", Insurance=" + insuranceOption
                + ", Discount=" + discount
                + ", Processed Cost=" + calculateProcessedCost()
                + "]";
    }
}
