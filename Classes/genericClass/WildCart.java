package genericclass;

import java.util.List;

public class WildCart {
    
    //this is wildcart method  that store the  list of number like array list it can be interger list ,float list , double list , long list
    public void computeList(List<? extends Number> source, List<? extends Number> destination)
    {

    }
    //this generic type method 
    
    public <G extends Number> void computeList1(List<G> source,List<G>destination)
    {

    }

    /* 1st  difference  - If you pass in wild cart method source is int and desination if float  But in Generic type method you only one type variable
     * 2nd - in wildcart super for lowet bound but here in generic type not possibile
     *  
     */
    //unbounded wild cart. So when we don't know what type of obj we use there we use the unbounded wild cart
     public void computeList2(List<?> source)
    {
       Object obj = source.get(0);
    }
}
