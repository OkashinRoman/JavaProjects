/**
 * Created by okashinR on 18/04/14.
 */
abstract class RaceCar extends Car {
 int speed;
 RaceCar(int carSpeed, int CarId, String CarColor){
     super(CarId, CarColor);
     speed = carSpeed;
 }
    RaceCar(){
        super();
    }

    @Override
    public void ride() {
        super.ride();
        System.out.println("Wiii-hooooo my speed is"+speed);
    }

   @Override
   public String ToString(){
       return (super.ToString()+" and My speed is "+speed);
    }
}
