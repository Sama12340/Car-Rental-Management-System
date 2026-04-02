package crms;

// this class represents the insurance option for a booking
public class InsuranceOption {

    private String type;   // insurance type
    private double price;  // insurance price

    // constructor to initialize insurance option
    public InsuranceOption(String type, double price) {
        this.type = type;
        this.price = price;
    }

    // getter methods
    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    // setter methods
    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // returns insurance option details as a string
    @Override
    public String toString() {
        return "InsuranceOption [Type=" + type + ", Price=" + price + "]";
    }
}
