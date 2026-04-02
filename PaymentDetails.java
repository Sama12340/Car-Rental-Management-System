package crms;

// this class represents payment details for a finalized booking
public class PaymentDetails {

    private double depositAmount;      // deposit paid
    private double totalRentalCost;    // total rental cost
    private double outstandingBalance; // remaining balance

    // constructor to initialize payment details
    public PaymentDetails(double depositAmount, double totalRentalCost, double outstandingBalance) {
        this.depositAmount = depositAmount;
        this.totalRentalCost = totalRentalCost;
        this.outstandingBalance = outstandingBalance;
    }

    // getter methods
    public double getDepositAmount() {
        return depositAmount;
    }

    public double getTotalRentalCost() {
        return totalRentalCost;
    }

    public double getOutstandingBalance() {
        return outstandingBalance;
    }

    // setter methods
    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public void setTotalRentalCost(double totalRentalCost) {
        this.totalRentalCost = totalRentalCost;
    }

    public void setOutstandingBalance(double outstandingBalance) {
        this.outstandingBalance = outstandingBalance;
    }

    // returns payment details as a string
    @Override
    public String toString() {
        return "PaymentDetails [Deposit=" + depositAmount
                + ", Total Rental Cost=" + totalRentalCost
                + ", Outstanding Balance=" + outstandingBalance + "]";
    }
}