

class Calculation{

    //This is method over load 
    public int sum(int val1 ,int val2){
        int total = val1+val2;
        return total;

    }
    public  int  sum(int val1 ,int val2,int val3){
        int total = val1+val2+val3;
        return total;

    }
    //this is method overridden Parent class method
     
    public int print()
    {
       System.out.println("This is parent class");
       return 1;
    }


    protected  int getPenPrice()
    {
        int penB=25;
        int penAllCom=20;
        int totalPenPrice =sum(penB,penAllCom);
        return totalPenPrice;
    }
    // public int sysMethod()
    // {
    //     int a = 20;
    //    double ans = Math.sqrt(a);
    //     return (int)ans;
    // }


}
//
class otherC extends Calculation
{
    public int getPrice()
    {
       return getPenPrice();
    }
}
//this is method overridden child class that is use parent class method 
class ChildClass extends Calculation
{
   
    public int  print()
    {
       System.out.println("this is Child Method of print");
       return 1;
    }
    
}




public class Main
{
    public static void main(String[] args) {
        //this is method overload
        Calculation c = new Calculation();
        System.out.println(c.sum(1,3,4));

        //this is method overridden
        Calculation p = new ChildClass();
        System.out.println(p.print());
    }
}
