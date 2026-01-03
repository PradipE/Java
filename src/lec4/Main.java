   class Dummy
   {
    //byte var;// So defult variable only assign to class no variable .Won't be a object variable .  It only possible if you assin some value
    //short var1;
    //int var;
    

    //member Variable
    int memberVariable;

    //static variable or class variable is is accessable by class any object can use this inside class
    static int staticVariable = 100;

    //constructor
       Dummy()
       {

       }
       //Paramaetrised constructor
       Dummy(int a)
       {

       }
      public void dummy()
      {
         // System.out.println(var);

         //local variable
         int localVariable= 100;

      }
   }
   
   class Dummy2
   {
      
   }
   


public class Main{

     public static void main(String[] args) {
          
        //   Dummy obj = new Dummy();

        //   obj.dummy();

        // long var= 2333l; It's long
        // System.out.println(var);
         
        // //Float 
        // float var1 = .3f;
        // float var2 = .1f;
        // float var3 = var1-var2;
        // System.out.println(var3);


      //   //Automatic conversion

      //    byte x=20;
      //    int y =x;
      //    long z = y;
         
      //    System.out.println(z);



      // //Downcassting
      //   int y =20;
      //   short x =(short)y;
      //   System.out.println(x);
      

      //access static variable 
      Dummy obj1 =new Dummy();
       Dummy obj2 =new Dummy();
       //you can't access static variable through object only by class
       System.out.println(Dummy.staticVariable);
       System.out.println(obj1.memberVariable );
    
         
     }
}