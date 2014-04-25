/**
 * Created by okashinR on 19/04/14.
 */
public class RaceCar2 extends RaceCar {
    RaceCar2() {

    }

    RaceCar2(int carSpeed, int CarId, String CarColor) {
        super(carSpeed, CarId, CarColor);
    }

    @Override
    public String toString() {
        return (super.toString() + " RaceCar2");
    }

    @Override
    public void ride() {
        super.ride();
        System.out.print("zhhhhhhh");
    }
}
