package pojoclass;
//enum class all constructor are private

public enum EnumClass implements MyInterface {
//Enum class with out values 
    // Monday,
    // Tuesday,
    // Wednesday,
    // Thursday,
    // Friday,
    // Saturday,
    // Sunday;

//     //Enum with custom values 
//     Monday(104,"1st of week"), 
//     Tuesday(105,"2nd of week"),
//     Wednesday(106,"3rd of week"),
//     Thursday(107,"4th of week"),
//     Friday(108,"5th of week"),
//     Saturday(109,"1st  weekend"),
//     Sunday(110,"2nd  week");
//    private   int val;
//    private   String data;
//      EnumClass(int val,String data) {
//         this.val = val;
//         this.data=data;
//     }
//     public int getVal()
//     {
//         return val;
//     }
//     public String getData()
//     {
//         return data;
//     }
//     // this is a static variable becuse it itrete over the class 
//     public static EnumClass getEnumFromVal(int value)
//     {
//         for(EnumClass sam :EnumClass.values())
//         {
//             if(sam.val == value)
//             {
//                 return sam;
//             }
//         }
//         return null;
//     }
    //this is how defult enum override works
//    // @Override
//     Monday{
//         public void defualtMethos()
//         {
//             System.out.println("THis is Monday value");
//         }
//     },
//     Tuesday,
//     Wednesday,
//     Thursday,
//     Friday,
//     Saturday,
//     Sunday;
//     public void defualtMethos()
//     {
//         System.out.println("THis is default enum Value");
//     }
    //Abstact method in Enum 
    //So, in asbstact each content has to define this asbsract methos
//  Monday{
//     public void dummyAbstactMethod()
//     {
//         System.out.println("THis is Monday");
//     }
//  },
//  Sunday{
//     public void dummyAbstactMethod()
//     {
//         System.out.println("This is weekend");
//     }
//  };//,
//  //so there throuh an error becuse i won,t define this abstact methos 
// // Wednesday;
//  public abstract void dummyAbstactMethod();
//this is implent interface
// Monday,
// Tuesday,
// Sunday;
// //overide
// public String toLowerCase()
// {
//     return this.name().toLowerCase();
// }

//so here if it is class not enum it value is compare by the value like integer it can be anything it value is check until the your value is not find '
//But is in Enum it cjhect by is constants sio its increse redibility so, you can only pass the the variable that you are define other cnstains your are not chech so it check by enum class 
  

}
