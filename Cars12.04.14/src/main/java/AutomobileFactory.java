import java.util.Random;

/**
 * Created by okashinR on 22/04/14.
 */
public class AutomobileFactory {

    public static Car CreateCar(String TypeOfCar) {
        Random rand = new Random();

        if (TypeOfCar == "Auto")
            return new Automobile1(rand.nextInt(5) + 1, "Red");


        return null;
    }
}
