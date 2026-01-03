package genericclass;

public class TypeErasure <T> {


     //what code we write when the bite code is generated it  replace with the acctual value 
     //ex like we use in Generic <G> it replace with Object 
     //When we use in bounded generic  Number <G> it replace with Number
     //It also workk with obj 

     T val ;
     
     public void setVal(T val)
     {
        this.val = val;
     }
     public T getVal()
     {
        return val;
     }

}
