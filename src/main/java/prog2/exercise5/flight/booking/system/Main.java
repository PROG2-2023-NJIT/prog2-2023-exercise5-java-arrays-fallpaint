package prog2.exercise5.flight.booking.system;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
        String depart = "2023-03-12";
        LocalDate departDate = LocalDate.parse(depart);
        String ret = "2023-03-14";
        LocalDate returnDate = LocalDate.parse(ret);

        String random = "FOF"+Math.random();

        String substring = random.substring(random.length()-4);

        String tripSource = "NANJING";
        String sourceAirport = "NANJING LUKOU INTERNATIONAL AIRPORT";
        String tripDestination = "OULU";
        String destinationAirport = "OULU AIRPORT";

        FlightBooking fb = new FlightBooking("John Doe", departDate, returnDate, 1, 3);
        int expResult = 4;

        fb.setTotalPassengers(1,3);
        int result = fb.getTotalPassengers();

        System.out.println("Please select the type of ride you want : ");
        Scanner sc = new Scanner(System.in);
        int engineRoom = sc.nextInt();

        // fb.setPassengerFullName("John Doe");
        // fb.setTicketNumber("MU759435");
        // fb.setTripSource("NANJING") ;
        // fb.setTripDestination("OULU");
        // fb.setFlightCompany("Flights-of-Fancy");
        // fb.setDepartingDate(LocalDate.parse("2023-03-12"));
        // fb.setReturnDate(LocalDate.parse("2023-03-14"));
        // fb.setTotalTicketPrice(5500);

        // System.out.println("Dear " + fb.getPassengerFullName() + ".Thank you for booking your flight with ."
                // + fb.getFlightCompany());

        System.out.println("Following are the details of your booking and the trip: ");

        System.out.println("Ticket Number: " + fb.getTicketNumber());

        System.out.println("From " + fb.getTripSource() + " to " + fb.getTripDestination());

        System.out.println("Date of departure: " + fb.getDepartingDate());

        System.out.println("Date of return: " + fb.getReturnDate());

        System.out.println("Total passengers: " + fb.getTotalPassengers());

        System.out.println("Total ticket price in Euros: " + fb.getTotalTicketPrice());

    }
}
