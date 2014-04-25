/**
 * Created by okashinR on 19/04/14.
 */
abstract class Truck extends Car {
    Truck() {
    }



    Truck(Integer CarId, String CarColor) {
        super(CarId, CarColor);
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void ride() {
        super.ride();
    }
}
