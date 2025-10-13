interface Birds{
   public  void canFLy(); // abstact method can't be private it public only
    public default  void minFlyHeight()
    {
        //in defult we can call anything like private , static ,defult,priavte static method
         mySPM();
         myPM();
         myPSM();
         canFLy();

    }
    //this is static method 
    static void mySPM()
    {
        //so in static we can only call static method 
          myPSM();
          
    }
    //this is private method 
    private void myPM()
    {
        //in private we  call private and static and defult and public  mathod method
        myPSM();
        mySPM();
        canFLy();
        minFlyHeight();
    }
    //this is Private static method
    private static void myPSM()
    {
          //in private static we can call private and static
          myPSM();
          mySPM();
          
        
    }
    
}


public class PrivateAndPrivateStaticM {
    public static void main(String[] args) {
        
    }
}
