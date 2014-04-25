import javax.jws.soap.SOAPBinding;
import java.net.SocketPermission;
import java.util.ArrayList;

/**
 * Created by okashinR on 22/04/14.
 */
public class AutomobileSalon {
    public ArrayList<RaceCar1> Race1List;
    ArrayList<RaceCar2> Race2List;

    ArrayList<Automobile1> Auto;

    AutomobileSalon() {
        Race1List = new ArrayList<RaceCar1>();
        for (int i = 0; i < 10; i++) {
            Race1List.add(i, (RaceCar1) RaceCarFactory.CreateCar("RaceCar1"));
        }

        Race2List = new ArrayList<RaceCar2>();
        for (int i = 0; i < 10; i++) {
            Race2List.add(i, (RaceCar2) RaceCarFactory.CreateCar("RaceCar2"));
        }


        Auto = new ArrayList<Automobile1>();
        for (int i = 0; i < 10; i++) {
            Auto.add(i, (Automobile1) AutomobileFactory.CreateCar("Auto"));
        }

    }

    ArrayList<Car> FindCarById(int id) {
        ArrayList<Car> list = new ArrayList<Car>();

        for (int i = 0; i < Race1List.size(); i++) {
            if (Race1List.get(i).get_id() == id)
                list.add(Race1List.get(i));
        }

        for (int i = 0; i < Race2List.size(); i++) {
            if (Race2List.get(i).get_id() == id)
                list.add(Race2List.get(i));
        }

        for (int i = 0; i < Auto.size(); i++) {
            if (Auto.get(i).get_id() == id)
                list.add(Auto.get(i));
        }
        return list;

    }

    void printCars(ArrayList<Car> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }


}
