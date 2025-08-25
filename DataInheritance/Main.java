
class Vehicle{
    boolean hasEngine;

      
    boolean getHasEngine()
    {
        return hasEngine;
    }
void setHasEngine(boolean hasEngine)
{
    this.hasEngine =hasEngine;
}

}

class Car extends Vehicle
{

    String carType;
    
    String getCarType()
    {
        return carType;
    }

    void setCarType(String carType)
    {
        this.carType=carType;
    }
    
}

public class Main{
    public static void main(String[] args) {
        Car thar = new Car();
        thar.setHasEngine(true);
        thar.setCarType("Suv");

        System.out.println(thar.getCarType());
        System.out.println(thar.hasEngine);

    }
}
