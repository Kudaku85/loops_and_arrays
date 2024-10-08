import static javax.swing.JOptionPane.showInputDialog;

class Trip {
    String departure;
    String destination;
    int planeCapacity;

    public Trip(String departure, String destination, int planeCapacity) {
        this.departure = departure;
        this.destination = destination;
        this.planeCapacity = planeCapacity;
    }
}

class Ticket {
    String name;
    Trip trip;

    public Ticket(String name, Trip trip) {
        this.name = name;
        this.trip = trip;
    }
}

public class Main {
    public static void main(String[] args) {
        Trip tripToMilan = new Trip("Oslo", "Milan", 5);
        Ticket[] passengerList = new Ticket[tripToMilan.planeCapacity];
        int milanTicketsSold = 0;

                while (milanTicketsSold < tripToMilan.planeCapacity) {
            String name = showInputDialog("Hva heter passasjeren?");
            if (!name.isBlank()) {
                Ticket freshTicket = new Ticket(name, tripToMilan);
                passengerList[milanTicketsSold] = freshTicket;
                milanTicketsSold++;
            }
        }
        for (int i = 0; i < tripToMilan.planeCapacity; i++){
            System.out.println(passengerList[i]);

        }

        for (Ticket ticket : passengerList) {
            System.out.println(ticket.name +" er på vei til " + ticket.trip.destination + " med avreise fra " + ticket.trip.departure);
        }

        tripToMilan.destination = "Schiphol (Faen!)";
        System.out.println("flyet ditt er omdirigert pga tåke elns lol");

        for (Ticket ticket : passengerList) {
            System.out.println(ticket.name +" er på vei til " + ticket.trip.destination + " med avreise fra " + ticket.trip.departure);
        }
    }
}