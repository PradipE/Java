 //so here we have benn created a multiple inhertance through interfcaes 
 
 interface  LanA{
    public  boolean canB();
}
interface  LanW{
    public  boolean canB();
}
class Croco implements  LanA,LanW{
    @Override
    public boolean canB()
    {
        return true;
    }
}

public class MultiInherit {
    public static void main(String[] args) {
         Croco c= new Croco();
         c.canB(); 
    }
}
