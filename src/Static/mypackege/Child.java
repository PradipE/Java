package mypackege;
public class Child extends Parent {

    public  static  void show() {  // not overriding, but hiding
        System.out.println("Child static method");
    }
}
