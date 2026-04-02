package crms;

public class CarRentalImplementer {

    private RentalSystem rentalSystem;

    // InitializeRentalSystem
    public RentalSystem InitializeRentalSystem(int numClients, int numCars, int numAgents) {

        // RentalSystem class
        rentalSystem = new RentalSystem(numClients, numCars, numAgents);

        System.out.println("System initialized.");
        return rentalSystem;
    }


    // Book
    public BookingRecord Book(Client c, Car car, Agent a,
                              String startDate, String endDate) {

        // simple cost calculation
        double baseCost = 100 * 3;

        BookingRecord booking = new BookingRecord(
                c, car, a, startDate, endDate, baseCost
        );

        System.out.println("Booking created.");
        return booking;
    }


    // Process
    public ProcessedRecord Process(BookingRecord br,
                                   InsuranceOption insurance,
                                   Discount discount) {

        // created processed record using values from booking
        ProcessedRecord processed = new ProcessedRecord(
                br.getClient(),
                br.getCar(),
                br.getAgent(),
                br.getRentStart(),
                br.getRentEnd(),
                br.getCost(),
                insurance,
                discount
        );

        System.out.println("Booking processed.");
        return processed;
    }


    // Finalize
    public FinalizedRecord Finalize(ProcessedRecord pr,
                                    PaymentDetails payment,
                                    PickupDetails pickup) {

        // created finalized record
        FinalizedRecord finalized = new FinalizedRecord(
                pr.getClient(),
                pr.getCar(),
                pr.getAgent(),
                pr.getRentStart(),
                pr.getRentEnd(),
                pr.getCost(),
                pr.getInsuranceOption(),
                pr.getDiscount(),
                payment,
                pickup
        );

        System.out.println("Booking finalized.");
        return finalized;
    }
}