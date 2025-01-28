package org.example;

public class FeeCalculator {

    public static double calculateFee(Visitor visitor, TicketType ticketType) {
        double fee = 0;

        // calculate price for adults
        if (visitor.age > 14) {
            fee = AdultFeeStrategy.calculateAdultFee(ticketType);
        }

        // calculate price for children
        if (visitor.age <= 14) {
            fee = ChildFeeStrategy.calculateChildFee(ticketType);
        }
        return fee;
    }

}
