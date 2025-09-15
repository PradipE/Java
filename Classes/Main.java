
// import genericclass.MultiBound;
// import genericclass.RawGenericClass;
public class Main {

    public static void main(String[] args) {

        //  Car c =new Car();
        //  ExtendAbstractClassM2 m = new ExtendAbstractClassM2();
        //  System.out.println(c.getEmpId());
        //  c.setEmpId(120);
        // System.out.println(c.getEmpId());
        // m.applyBrake();
        // m.pressAcclerator();
        // m.setMillage(13);
        // System.out.println("Millage is: "+m.getMillage());
        // m.pressClutch();


        // //the Objecttest hav't any parent or super class .But we can have a by defult super or parent class that is object ;
        // Object obj1 = new ObjectTestClass(12);
        // System.out.println(obj1.getClass());
        // NestedClass.InnerClass obj =  new NestedClass.InnerClass();
        // obj.print();
        // NestedClass object1 = new NestedClass();
        // object1.printPrivateNested();
        // // NestedClass.InnerClassNonStatic innerObj = object1.new InnerClassNonStatic();
        // object1.show2();
        // object1.displayLocalInner();
        // NestedClass.InheritEx2 inheritObj = object1.new InheritEx2();
        // inheritObj.displayInherit1();
        // Anonymous objAnon = new Anonymous() {
        //   public void pressBreak()
        //   {
        //      System.out.println("Press Break when slow down");
        //   }
        // };
        // objAnon.pressBreak();
        // GenericClass<Integer>  obj1 = new GenericClass<>();
        // GenericClass<String>  obj = new GenericClass<>();
        // obj1.setPrintValue(23);
        // System.out.println(obj1.getPrintValue());
        // GenericClass<String>.GenericSubClass genObj = obj.new GenericSubClass();
        // genObj.setPrintValue("THis is my data");
        // System.out.println(genObj.getPrintValue());
        // //this is a ex of the pair generic class 
        // PairGenericClass<Integer,String> obj3 = new PairGenericClass<>();
        // obj3.set(24,"Pradip Mondal");
        // System.out.println(obj3.getKey()+" -> "+obj3.getValue());
        //This is normal way of object creation 
        // RawGenericClass<String> parameterGenericObj = new RawGenericClass<>();
        // //this is ex of raw type of an generic class objet creation
        // //But the raw type genric class object creation does't work in real life

        // RawGenericClass rawObjCreation = new RawGenericClass();

        // rawObjCreation.setValue(12);
        // rawObjCreation.setValue("Pradip");

        // System.out.println(rawObjCreation.getValue());

        // MultiGeneric<MultiBound> multiObj = new MultiGeneric<>();
        // multiObj.setValue(new MultiBound(22));
        // multiObj.getValue();
        //find the values that are in enum class variable
        //ordinal() is use to find the defualt numbering that are fixed by jdk
      // for(EnumClass sample : EnumClass.values())
      // {
      //   System.out.println(sample.ordinal());
      // }
      // EnumClass enumVar =EnumClass.valueOf("Monday");
      // System.out.println(enumVar.name());
      // System.out.println(enumVar.ordinal());

      //Enum costumm values 
      // EnumClass sampleEnum = EnumClass.getEnumFromVal(109);
      
      // System.out.println(sampleEnum.getData());

      // //Enum override Method
      // EnumClass dummyObj = EnumClass.Tuesday;
      // dummyObj.defualtMethos();


      // //Enum Abstract class
      // EnumClass abstactObj = EnumClass.Sunday;
      // abstactObj.dummyAbstactMethod();
       

      //Enum implements Interface
      // EnumClass interfaceObj = EnumClass.Monday;
      // System.out.println(interfaceObj.toLowerCase());


    }
}
