
interface Lv {

    //public void fly(); //this is abstact method 
    //so you have to declear  
    default public void fly() {
        System.out.println("Fly");
    }
}

@FunctionalInterface //so in fi=nInterfcae you can,t do that because it inherit parent abstract method. So , in fnInterfcae only one abstact method 
interface FnLv extends Lv {

    public void canFLy();
}
//In FunctionalInterface if both have the same method so it can be allowed 

public class HandleFnToOther {

    public static void main(String[] args) {

    }
}
