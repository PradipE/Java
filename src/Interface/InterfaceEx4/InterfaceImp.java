
class Bird{
    //inside theclass interfcae can be protected 
     interface NonF{
        public void fly();
    }
}
abstract class Coke implements  Bird.NonF
{   
      public void fly()
      {
           System.out.println("Bird fly");
      }
}
class Pepsi extends Coke{

}
public class InterfaceImp {
    public static void main(String[] args) {
        Bird.NonF  c = new Pepsi();
        c.fly();
    }
}
