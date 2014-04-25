/**
 * Created by okashinR on 18/04/14.
 */
abstract class Car implements Rideable{
    private String color;
    private Integer id;

    Car(){};

    Car(Integer CarId, String CarColor )
    {
        id = CarId;
        color = CarColor;
    }

    int get_id(){
        return id;
    }

    void setId(int id){
        this.id = id;
    }

    String getColor(){
        return color;
    }

    void setColor(String color){
        this.color = color;
    }

    String ToString(){
        //System.out.println("I car"+"My Color is "+color+"My id is "+id);
        return ("I car"+"My Color is "+color+"My id is "+id);
    }

    @Override
    public void ride(){};
}
