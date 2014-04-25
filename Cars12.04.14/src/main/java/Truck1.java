/**
 * Created by okashinR on 19/04/14.
 */
public class Truck1 extends Truck {

    Truck1() {
    }

    ;

    Truck1(Integer CarId, String CarColor) {
        super(CarId, CarColor);
    }


    @Override
    public String toString() {
        return (super.toString() + "Truck1");
    }

    @Override
    public void ride() {
        super.ride();
        System.out.print("HappyTruck");
    }
}
