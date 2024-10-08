import java.text.DecimalFormat;
import java.util.Random;

public class Demos {
    public static void main(String[] args) {
        Random rand = new Random();
        DecimalFormat formatter = new DecimalFormat("#, ###"); //Brukes for å endre tallformatet på store integers til x,xxx,xxx repeating
        int randomNumber = 0;
        int attempt = 0;

        while (randomNumber != 1) {
            randomNumber = rand.nextInt(0, 5_379_617); //Ops, bound er _til_, ikke _til og med_. Bound-verdien må derfor være 1 høyere enn maks-verdien vi vil ha.
            attempt++;
        }
        System.out.println("Jackpot! It only took "+formatter.format(attempt) + "weeks.");

        while(true){
            randomNumber = rand.nextInt(0, 5_379_617);
            attempt++;
            if(randomNumber == 7){
                break;
            }
        }
        System.out.println("Jackpot! This time it only took "+formatter.format(attempt) + "weeks.");
    }
}