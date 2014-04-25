import java.util.Random;

/**
 * Created by okashinR on 22/04/14.
 */
public class TruckFactory {

    public static Car CreateCar(String TypeOfCar) {
        Random rand = new Random();

        if (TypeOfCar == "Truck1")
            return new Truck(rand.nextInt(5) + 1, "Blue") {
            };

        return null;


    }
}
