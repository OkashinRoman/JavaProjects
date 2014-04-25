/**
 * Created by okashinR on 19/04/14.
 */
public class RaceCar1 extends RaceCar{
    RaceCar1(){

    }
    public RaceCar1(int carSpeed, int CarId, String CarColor){
        super(carSpeed, CarId, CarColor);
    }


    @Override
    public String ToString() {
        return (super.ToString()+"car1");
    }

    @Override
    public void ride() {
        super.ride();
        System.out.print("rrrrrrrr");
    }
}
