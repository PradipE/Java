package nestedclass;

public  class NestedClass {
      int instanceVariable =10;
      static  int staticVariable = 20;
      
      //This all are static inner class 
       static class InnerClass
      {
           public void print()
           {
              System.out.println("This is a instance variable "+staticVariable);
           }
      }
      //Nested class can be private protected and also public 
      //private
      private  static class InnerClass1{
            
            public void print1()
           {
              System.out.println("This is a private nested class");
           } 
      }
      //method
      public void printPrivateNested()
      {
            InnerClass1 privateobj =new InnerClass1();
            privateobj.print1();
      }
      //this is non static inner class  this is also known as member inner class it also can be private protected and defult
     private class InnerClassNonStatic
      {
            public void print3()
            {
                  System.out.println("This is non static inner class and they have both value static and instance variable "+instanceVariable+" "+staticVariable);
            }
      }
      //so this InnerClassNonStatic class is private so we create an methos that is public 
      public void show2()
      {
            InnerClassNonStatic newObj =new InnerClassNonStatic();
            newObj.print3();
      }

      //this is a local inner class but it not create an a.class beacuse it is inside an block that block can't be a class
       
      public void displayLocalInner(){
            int localInnerVariable =23;
             class LocalInnerClass{
                public void displayLocalInnerMethod()
                {
                   System.out.println("THis are the Nestedclass Variablre "+instanceVariable+" , "+staticVariable+" this is local inner class variable "+localInnerVariable);
                }
     
            }
            //with in this block tha class can be initicited
            LocalInnerClass objLocalInnerClass =new LocalInnerClass();
            objLocalInnerClass.displayLocalInnerMethod();
      }

      // //Inherit inner class  and also ex of how we achive in static 
      // //static Parent so its associted with object 
      // public static class InherirEx1
      // {
      //       public void displayInherit()
      //       {
      //             System.out.println("This is Static class inherit by anathor non static class");
      //       }
      // }
      // //non statoc child that inherit static parent class
      // public class  InheritEx2 extends InherirEx1{

      //   //First we create an constructor  before use 
       
      //   public void displayInherit1()
      //   {
      //       displayInherit();
      //   }
            
      // }

      //anonymous inner class 
      



}
