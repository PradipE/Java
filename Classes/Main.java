import classespackege.Car;
import classespackege.ExtendAbstractClassM2;
public class Main {
    public static void main(String[] args) {
        
       Car c =new Car();
       ExtendAbstractClassM2 m = new ExtendAbstractClassM2();
        
       
       System.out.println(c.getEmpId());
       c.setEmpId(120);
      System.out.println(c.getEmpId());
      m.applyBrake();
      m.pressAcclerator();
      m.setMillage(13);
      System.out.println("Millage is: "+m.getMillage());
      m.pressClutch();
    }
}
