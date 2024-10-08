import java.text.DecimalFormat;
import java.util.Random;

public class Demos {
    public static void main(String[] args) {
        Random rand = new Random(); //Vi lager et objekt av klasse Random, som vi bruker for å generere tilfeldige tall.
        DecimalFormat formatter = new DecimalFormat("#, ###"); //Brukes for å endre tallformatet på store integers til x,xxx,xxx repeating
        int randomNumber = 0; //tallet må initialiseres utenfor loopen, ellers vil compileren få problemer.
        int attempt = 0; //Se over


        //while-Loop som lager random tall og sjekker om de matcher et bestemt tall.
        while (randomNumber != 1) { //Vil kjøre så lenge tallet ikke er nøyaktig 1.
            //Under genererer vi tall mellom origin (0) og bound (5 379 617). Oddsene for å vinne i lotto er 1 til 5 379 616
            randomNumber = rand.nextInt(0, 5_379_617); //Ops, Bound-verdien må være 1 høyere enn maks-verdien vi vil ha.
            attempt++; //Holder styr på hvor mange forsøk vi trenger.
        }
        System.out.println("Jackpot! It only took "+formatter.format(attempt) + "weeks.");

        //Denne while-loop'en gjør det samme som den over, men er strukturert annerledes. while(true) vil kjøre helt til vi bruker en break command.
        while(true){
            randomNumber = rand.nextInt(0, 5_379_617); //Genererer random tall mellom origin og bound.
            attempt++;
            if(randomNumber == 7){ //Sjekker om vi har funnet riktig tall.
                break; //Bryter ut av loopen
            }
        }
        System.out.println("Jackpot! This time it only took "+formatter.format(attempt) + "weeks.");
    }
}