//implement interface
interface Vehicle
{
    void start();
    void accelerate();
}


class Bike implements Vehicle
{
    //override
    public void start()
    {
        System.out.println("Bike is started");
    }
    //override
    public void accelerate()
    {
        System.out.println("Bike is acclerating now");
    }

}

public class Main{
    public static void main(String[] args) {
        //import that class

        Vehicle myVehicle = new Bike();

        myVehicle.start();
        myVehicle.accelerate();
    }
}
