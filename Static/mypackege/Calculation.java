package mypackege;
//variable arguments 
public class  Calculation
{
    public  int sum (int var1st,int ...var1)
    {
        int output =0;
       for(int var: var1)
       {
            output = output+var;
       }
       return output;
    }
}
