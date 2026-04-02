package crms;

// this class represents a discount applied to a booking
public class Discount {

    private String type;    // discount type
    private double amount;  // discount amount

    // constructor to initialize discount
    public Discount(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    // getter methods
    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    // setter methods
    public void setType(String type) {
        this.type = type;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // returns discount details as a string
    @Override
    public String toString() {
        return "Discount [Type=" + type + ", Amount=" + amount + "]";
    }
}
