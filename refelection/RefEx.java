
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

class RefEx {

    public static void main(String[] args) throws Exception{
        // Class eagleClass = ExRefClass.class;
        // System.out.println(eageleClass.getName());
        // System.out.println(Modifier.toString(eageleClass.getModifiers()));

        //reflection method 
        // Class eagleClass1 = ExRefClass.class;

        //So how we call this method or how we know mwthod type and here we only get private method and also get parent class method 
        // Method[] methods = eagleClass1.getMethods();

        //how we know each and every possibilites 
        // for(Method method: methods)
        // {
        //   System.out.println("Method name: "+method.getName());
        //   System.out.println("Method type: "+method.getReturnType());
        // }
        //if we need only that class and all public private all so, here how we can do that 
        // Method[] methods1 = eagleClass1.getDeclaredMethods();
        // for (Method method : methods1) {
        //     System.out.println("Method name: " + method.getName());
        //     System.out.println("Method type: " + method.getReturnType());

        // }
        // try {
        //     //we have Class Instance  method using reflection
        //     Class<?> eagleClass2 = Class.forName("ExRefClass");
        //     //we create an object that have new instance 
        //     Object eagleObj = eagleClass2.getDeclaredConstructor().newInstance();

        //     //get the method that are present in refexclass 
        //     Method paramMethod = eagleClass2.getMethod("param", int.class, boolean.class, String.class);

        //     //invoke the method 
        //     paramMethod.invoke(eagleObj, 10, true, "Sucess");

        // } catch (Exception e) {
        //     e.getStackTrace();
        // }

        //how we achive field using reflection
        //how we change the field of and instance 
        //we create an obj of refclass  
        //thats how we access in public field 
        // Class eagle = ExRefClass.class;

        //ExRefClass eagleobj1 = new ExRefClass();

        // Field field = eagle.getDeclaredField("breed");
        // field.set(eagleobj1, "eagelBrown");
        // System.out.println(eagleobj1.breed);
        //how we do in private filed 
        // Field field = eagle.getDeclaredField("canS");
        // field.setAccessible(true);
      //  there is a disadv becuse it not only accesacble by public it can be possibile in private field also 

       // how to reflect the private constructor 
       // get the reflecttionn of this class 
        Class<?> eagClass = ExRefClass.class;
        //to acess private constructor 
        Constructor<?>[] eagConstructorList = eagClass.getDeclaredConstructors();

        for(Constructor eagConstructor:eagConstructorList)
        {
            System.out.println("Modifier: "+Modifier.toString(eagConstructor.getModifiers()));
            //so in private modifier set accesable is always true 
            eagConstructor.setAccessible(true);
            //we create an obj using private constuctor
            ExRefClass eagObj = (ExRefClass)eagConstructor.newInstance();
            eagObj.fly();
            
        }
    }
}
