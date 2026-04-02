package crms;

// this class represents pickup details for a finalized booking
public class PickupDetails {

    private String pickupBranch;         // pickup branch
    private String pickupDate;           // pickup date
    private String specialInstructions;  // special instructions

    // constructor to initialize pickup details
    public PickupDetails(String pickupBranch, String pickupDate, String specialInstructions) {
        this.pickupBranch = pickupBranch;
        this.pickupDate = pickupDate;
        this.specialInstructions = specialInstructions;
    }

    // getter methods
    public String getPickupBranch() {
        return pickupBranch;
    }

    public String getPickupDate() {
        return pickupDate;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }

    // setter methods
    public void setPickupBranch(String pickupBranch) {
        this.pickupBranch = pickupBranch;
    }

    public void setPickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
    }

    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    // returns pickup details as a string
    @Override
    public String toString() {
        return "PickupDetails [Pickup Branch=" + pickupBranch
                + ", Pickup Date=" + pickupDate
                + ", Special Instructions=" + specialInstructions + "]";
    }
}
