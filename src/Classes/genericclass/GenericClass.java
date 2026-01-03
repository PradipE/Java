package genericclass;

public class GenericClass<G> {

    //So this is a normal class that has no variable type here we use the Object but here we always do typecasting
    // Object value;
    // public Object getPrintValue ()
    // {
    //    return value;
    // }
    // public void setPrintValue(Object value)
    // {
    //     this.value =value;
    // }
    //how to implement this class into ageneric class
    G value;

    public G getPrintValue() {
        return value;
    }

    public void setPrintValue(G value) {
        this.value = value;
    }
    //lets create a generic sub class 
    public class GenericSubClass extends GenericClass<G> {
          
    }

    
    

}

