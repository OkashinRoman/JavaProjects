/**
 * Created by okashinR on 19/04/14.
 */
abstract class Truck extends Car {
    Truck(){};
    Truck(Integer CarId, String CarColor){
        super(CarId, CarColor);
    }


    @Override
    String ToString() {
        return super.ToString();
    }

    @Override
    public void ride() {
        super.ride();
    }
}
