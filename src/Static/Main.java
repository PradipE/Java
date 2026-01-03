import mypackege.Calculation;
import mypackege.Child;
import mypackege.Child2;
import mypackege.Parent;
import mypackege.Static;


public class Main {

    public static void main(String[] args) {

        Static.penTotalPrice();
        //You can access a static variable via object 
        Static s = new Static();
        // s.penTotalPrice();

        //this is non-static method but  but here we use static and non-static instance 
        s.printHead();

        //Static method can't be over ridden it will not through error but it hide hide the overridden out put beacuse it onec load into the memory when class is loded
        Parent p = new Parent();
        Parent c = new Child();

        p.show();
        c.show();

        //abstract class 
        Child2 c1 = new Child2();
        System.out.println(c1.result());
        Calculation c3 = new Calculation();
        System.out.println("sum : "+ c3.sum(1,2,3,4,5));

    }
}
