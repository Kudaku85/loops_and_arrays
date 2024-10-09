import static javax.swing.JOptionPane.showInputDialog;

//Klasse for å opprette billetter
class Ticket {
    String name;
    String destination = "Milan";
    String departure = "Oslo";

    //Konstruktør for å enkelt opprette objekter av billetter
    public Ticket(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        int planeCapacity = 5; //Dette bestemmer hvor mange som får plass på flyet, og er maksverdien for loopen vår.
        Ticket[] passengerList = new Ticket[planeCapacity]; //Vi oppretter et array med antall plasser lik flykapasiteten
        int ticketCount = 0; //Initialiserer verdien utenfor loopen.
        //String[] names = {"Eivind", "Sonja", "Siri", "Kaja", "Lars"}; //Aktiver kodelinje 22 og 25 og kommenter ut linje 26 hvis dere vil slippe input.

        while (ticketCount < planeCapacity) { //Starter en while-loop.
            //String name = names[ticketCount];
            String name = showInputDialog("Hva heter passasjeren?"); //Kommenter ut denne kodelinjen og aktiver linje 22 & 25 hvis dere blir lei av å skrive inn navn.
            if (!name.isBlank()) { //Sjekker om navnet er blankt. Hvis det er det trigges ikke if-funksjonen og loopen begynner på nytt uten å øke ticketCount.
                Ticket freshTicket = new Ticket(name); //Hvis navnet ikke er blankt bruker vi det til å opprette en ny billett
                passengerList[ticketCount] = freshTicket; //og legger billetten i arrayet, på posisjon = ticketSsold.
                ticketCount++; //Så øker vi telleren vår og posisjonen i arrayet.
            }
        }

//        for (int i = 0; i < tripToMilan.planeCapacity; i++){
//            System.out.println(passengerList[i]); //Obs, vil kun printe ut minneadressen til objektet, ikke innholdet. Lærer mer om dette senere.
//        }

        for (int i = 0; i < planeCapacity; i++){//Denne loopen vil printe ut informasjonen fra hver enkelt billett.
            System.out.println(passengerList[i].name +" er på vei til " + passengerList[i].destination + " med avreise fra " + passengerList[i].departure);
        }

        System.out.println("\nflyet ditt er omdirigert pga tåke elns lol. Hilsen RyanAir \n");

        for (Ticket ticket : passengerList) { //Bruker en for loop for å endre destinasjonen for hver enkelt billett
            ticket.destination = "Schiphol (!)";
            System.out.println(ticket.name +" er nå på vei til " + ticket.destination);
        }
        System.out.println();
        for (Ticket ticket : passengerList){ //Vi kan også bruke loops til å lete gjennom et array og kun endre enkelte verdier.
            if (ticket.name.equals("Eivind")) { //Sjekker om vi har funnet riktig passasjer
                ticket.destination = "Norilsk, Siberia"; //...Og gir han en skikkelig dårlig dag.
                System.out.println(ticket.name +" er nå på vei til " + ticket.destination);
                break; //break kan også brukes for å avslutte en for-loop tidlig. Vi trenger ikke kjøre resten av loop'en når vi har funnet ̶o̶f̶f̶e̶r̶e̶t̶ passasjeren vår.
            }
        }
    }
}