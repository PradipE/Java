class Bike
{
    void colour()
    {
        System.out.println("Bike colour is Red");
    }
}

class Kwaswaki extends Bike
{
    void colour()
    {
        System.out.println("Bike Colour is Kwaswaki green");
    }
}

class Main
{
    public static void main(String[] args) {
        Bike b = new Kwaswaki();

        b.colour();
    }
}
