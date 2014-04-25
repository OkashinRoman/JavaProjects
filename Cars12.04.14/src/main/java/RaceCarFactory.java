import java.util.Random;

/**
 * Created by okashinR on 22/04/14.
 */
public class RaceCarFactory {

    public static Car CreateCar(String TypeOfCar) {
        Random rand = new Random();

        if (TypeOfCar == "RaceCar1")
            return new RaceCar1(200, rand.nextInt(5) + 1, "Blue");


        return (new RaceCar2(200, rand.nextInt(5) + 1, "DarkBlue"));
    }
}
