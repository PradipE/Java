package classespackege;

public abstract  class  ExtendsAbstactM extends AbstactClass {

    public ExtendsAbstactM() {
       super();
    }
    public void setMillage(int millage)
    {
      this.millage=millage;
    }
    public int getMillage()
    {
        return millage;
    }

     
    public void pressAcclerator()
    {
        System.out.println("Press accletor to increase speed");
    }
    public void applyBrake()
    {
        System.out.println("Apply brake");
    }
    //this is abstract class  thatis child class of abstract class it also declear method and also define method that are in parent class
    public abstract  void pressClutch();


 
     
}
