class Math{

    int add(int a,int b)
    {
        return a+b;
    }

    double add(double a, double b)
    {
        return a+b;
    }

    int add (int a, int b ,int c)
    {
        return a+b+c;
    }
}
class Main
{
    public static void main(String[] args) {
        Math m = new Math();
            System.out.println(m.add(2,3,5));
            System.out.println(m.add(2.4,5));
            System.out.println(m.add(2,3));
           

        }
}
