
 class  Static {

    int leg = 10;
    static int head = 30;

    public static int penTotalPrice() {
        int penBody = 10;
        int penAll = 22;
        head = 33;
        // you caan't access a non-static instance in a static method leg=20;
        int totalPrice = penAll + penBody;
        System.out.println(totalPrice);
        Static obj1 = new Static();
        int ans = obj1.printHead();
        return totalPrice;

    }

    public int printHead() {
        leg = 30;
        head = 22;
        int ans = leg + head;
        System.out.println("total is :" + ans);

        return ans;
    }

}//This is ex of static methos can't be overridden

class Parent {

    public static void show() {
        System.out.println("Parent static method");
    }
}


class Child extends Parent {

    public  static  void show() {  // not overriding, but hiding
        System.out.println("Child static method");
    }
}

//this is example of Final method
class Parent1 {
    public final void show() {
        System.out.println("Parent static method");
    }
}
class Child1 extends Parent1 {
    // public void show() {  // not overriding, but hiding
    //     System.out.println("Child static method");
    // }
}
//abstract class has no defination only decleraton and child class duty to decleration
abstract class Hello {

    
    public abstract int result();

}
class Child2 extends Hello{
       public int result()
       {
          int a=5,b=6;
          int ans = a+b;
          return ans;

       }
}

//variable arguments 
class  Calculation
{
    public  int sum (int var1st,int ...var1)
    {
        int output =0;
       for(int var: var1)
       {
            output = output+var;
       }
       return output;
    }
}


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
