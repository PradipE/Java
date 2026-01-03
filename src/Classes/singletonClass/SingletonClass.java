package singletonClass;

public class SingletonClass {
    
    //this is eger initilization
    // private static SingletonClass dbConnectionObj = new SingletonClass();

    // private SingletonClass()
    // {

    // }
    // public static SingletonClass getData()
    // {
    //     return dbConnectionObj;
    // }

    //Lazy initilization

    // private static SingletonClass dbObj;

    // private SingletonClass()
    // {

    // }
    // public static SingletonClass getData()
    // {
    //     if(dbObj ==null)
    //     {
    //     dbObj =new SingletonClass();
    //     }
    //     return dbObj; 
    // }

    //Synchroized Method 
 
    // private static SingletonClass dbObj1;

    // private SingletonClass()
    // {

    // }

    // synchronized public static SingletonClass getData(){
    //     if(dbObj1 == null)
    //     {       
    //           dbObj1 = new SingletonClass();
    //     }
    //     return dbObj1;
    // }

    //Double checking machinism 
    private static volatile SingletonClass dbObj2;
    private SingletonClass()
    {

    }
    public static SingletonClass getData3()
    {
        if(dbObj2 ==null)
        {
            //so if first create an object if that is null synchronized method create first object 
            synchronized (SingletonClass.class) {

                if(dbObj2 ==null)
                {
                    dbObj2 =new SingletonClass();
                }
            }
        }
        return dbObj2;
    }


}
