/**
 * Created by okashinR on 23/04/14.
 */
public class Automobile extends Car {
    Automobile(){};
    Automobile(Integer CarId, String CarColor){
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
