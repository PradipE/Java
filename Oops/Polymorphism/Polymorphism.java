
class calculator{

    public int add(int a, int b)
    {
       return a+b;
    }
    public int add(int a, int b,int c)
    {
        return a+b+c;
    }
    public float   add(float  a, float  b)
    {
        return a+b;
    }
}


public class Polymorphism{

    public static void main(String[] args) {

        calculator c= new calculator();

        System.out.println(c.add(2,3));
        System.out.println(c.add(2,3,4));
        //System.out.println(c.add(2.3 ,3.5));
        
    }
}
