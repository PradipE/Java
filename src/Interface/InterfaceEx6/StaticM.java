interface B{
  public static boolean canB(){
       return true;
    }
}
class A implements B{
    public  void comapre()
    {
       if(B.canB() == true)
       {
           System.out.println("Compare statement is true");
       }else
       System.out.println("Comapare statement is false");
       
    }
}
public class StaticM {
  public static void main(String[] args) {
      A a = new A();
      a.comapre();
  }
}
