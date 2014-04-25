/**
 * Created by okashinR on 19/04/14.
 */
public class Automobile1 extends Automobile {
    Automobile1(){};
    Automobile1(Integer CarId, String CarColor){
        super(CarId, CarColor);
    }


    @Override
    public String ToString() {
        return (super.ToString()+"qqq");
    }

    @Override
    public void ride() {
        super.ride();
        System.out.print("Boring");
    }
}
