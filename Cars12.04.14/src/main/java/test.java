import java.util.Random;

/**
 * Created by okashinR on 23/04/14.
 */
public class test {



    public static void main(String[] args) {
        AutomobileSalon salon = new AutomobileSalon();
        Random rand = new Random();
        int id = rand.nextInt(5)+1;
        salon.printCars(salon.FindCarById(id));

}
}
