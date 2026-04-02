package crms;

public class TestRental {

    public static void main(String[] args) {
        CarRentalImplementer implementer = new CarRentalImplementer();

        // Step 1: Initialize the rental system with ONE client, TWO agents, and ONE car
        RentalSystem rentalSystem = implementer.InitializeRentalSystem(1, 1, 2);

        Client client = rentalSystem.getClients().get(0);
        Car car = rentalSystem.getCars().get(0);
        Agent agent1 = rentalSystem.getAgents().get(0);
        Agent agent2 = rentalSystem.getAgents().get(1);

        System.out.println("Client: " + client.getName());
        System.out.println("Car: " + car.getModel());
        System.out.println("Agents: " + agent1.getName() + " and " + agent2.getName());

        // Step 2: Create TWO booking records for the same client and car, each handled by a different agent
        BookingRecord booking1 = implementer.Book(client, car, agent1, "2023-10-01", "2023-10-03");
        BookingRecord booking2 = implementer.Book(client, car, agent2, "2023-10-01", "2023-10-03");

        System.out.println("Booking 1 by " + booking1.getAgent().getName());
        System.out.println("Booking 2 by " + booking2.getAgent().getName());

        // Step 3: Process the two booking records, applying different insurance or discount terms
        InsuranceOption insurance = new InsuranceOption("Basic", 50.0);
        Discount discount = new Discount("Loyalty", 30.0);

        ProcessedRecord processed1 = implementer.Process(booking1, insurance, null); // with insurance
        ProcessedRecord processed2 = implementer.Process(booking2, null, discount); // with discount

        System.out.println("Processed 1: Insurance " + processed1.getInsuranceOption() + ", Cost: " + processed1.calculateProcessedCost());
        System.out.println("Processed 2: Discount " + processed2.getDiscount() + ", Cost: " + processed2.calculateProcessedCost());

        // Step 4: Compare the total costs of the two processed records
        double cost1 = processed1.calculateProcessedCost();
        double cost2 = processed2.calculateProcessedCost();

        System.out.println("Cost 1: " + cost1);
        System.out.println("Cost 2: " + cost2);

        ProcessedRecord betterDeal = (cost1 < cost2) ? processed1 : processed2;
        System.out.println("Better deal is: " + (cost1 < cost2 ? "Processed 1" : "Processed 2"));

        // Step 5: Finalize the booking that offers the better deal to the client
        PaymentDetails payment = new PaymentDetails(100.0, betterDeal.calculateProcessedCost(), betterDeal.calculateProcessedCost() - 100.0);
        PickupDetails pickup = new PickupDetails("Main Branch", "2023-10-01", "None");

        FinalizedRecord finalized = implementer.Finalize(betterDeal, payment, pickup);

        System.out.println("Finalized booking: " + finalized);
    }
}
