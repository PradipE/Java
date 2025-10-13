//this is 1 st way how we implement the FunctionalInterface 

@FunctionalInterface
interface Bird {

    void canFly(int val);

    //if i add anathor abstact method it through error i can add the defult method and static method or object class method 
    //void canFly1(String val);
    //defult method 
    default void getHeight() {

    }

    // static mathod 
    static void getFlyTime() {

    }

    //object class 
    String toString();
}
//2nd way So, in function interfcae we can use annonymous

@FunctionalInterface
interface Data {

    public void getData(String val);

}
//3rd way Lambda functionInterface implementation
@FunctionalInterface
interface Data2 {

    public void getData1(String val);

}
public class FunctionalInterfaceEx {

    public static void main(String[] args) {


      // 1st way is normal create an object and lets carry on

        //2nd way So, in function interfcae we can use annonymous
        // Data d = new Data() {
        //     @Override
        //     public void getData(String val) {
        //         System.out.println("Can Fly upto");
        //     }
        // };
        // d.getData("1000 mtr");


        //3rd way Lambda functionInterface implementation
        Data2 d2 = (String val)->
        {
            System.out.println("This is Lambda expression");
        };
        d2.getData1("Lambda");



    }
}
