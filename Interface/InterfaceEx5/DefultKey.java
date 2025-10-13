interface Bird 
{
    public void canFly();
    /*so if anthor method is add that are use in all class so you don't have to write 
    each of them in every single class you just implement this inside the interface using defualt keyword */
    default int getFlyHeight()
    {
        return 100;
    }
}
class Sparrow implements Bird{
public void canFly()
{
     System.out.println("sparrow can fly");
}
}
class Sparrow1 implements Bird{
    public void canFly()
{
     System.out.println("sparrow1 can fly");
}
}
class Sparrow2 implements Bird{
    public void canFly()
{
     System.out.println("sparrow2 can fly");
}
}
//if any interfcae contain defullt method that child have,t to define anything they just use it 
//you ca't create of an abstact method
//this this 1st Way of implementing 
interface A{
    default boolean canB()
    {
        return true;
    }
}
interface B extends  A{

}
class C implements  B{

}
//This is the second way
/*if any interfcae contain defult method but and his child make it abstact method when chils
 childs are define this mathod they have to be implementing aggin becuse it is abstact now so, output has to change also if you need 
 here, is the ex:*/
interface A1{
    default boolean canB()
    {
        return true;
    }
}
interface B1 extends  A1{
     boolean canB();
}
class C1 implements  B1{
     public boolean canB()
     {
        return false;
     } 
}
//3rd way 
interface A2{
    default boolean canB()
    {
        return true;
    }
}


public class DefultKey {
    public static void main(String[] args) {
        Bird b = new Sparrow();
        b.canFly();
        System.out.println( b.getFlyHeight());
        
        C a = new C();
        System.out.println(a.canB());
        C1 c = new C1();
        System.out.println(c.canB());

    }
}
