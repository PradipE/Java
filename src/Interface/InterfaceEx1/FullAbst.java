
interface Bird{
     public void fly();
     
}
class Species  implements  Bird{
     public void fly()
     {
        System.out.println("Bird can fly");
     }
}
public class FullAbst {
    public static void main(String[] args) {
        Bird b = new Species();
        b.fly();
    }
}
