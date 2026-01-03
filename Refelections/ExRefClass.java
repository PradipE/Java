
public class ExRefClass {

    public String breed;
    private boolean canS;

    public void fly() {
        System.out.println("can fly");
    }

    private void eat() {
        System.out.println("can eat");
    }

    private ExRefClass() {
        //private constructor
        //if constuctor is privaye so you can,t create a object of this class 
        //it its possible by reflection
        // System.out.println("private constructor called ");
    }

    public void param(int intParam, boolean boolParam, String strParam) {
        System.out.println("intParam: " + intParam + " boolParam :" + boolParam + " strParam :" + strParam);
    }

}
