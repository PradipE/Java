
 class student{
     // object    
    int age;
    String name;
    
    // this some declered constructor value
    public  student(int newage,String newname)
    {
        name = newname;
        age= newage;

    }
    
    //behaviour of this object
    void play()
    {
        System.out.println(name+ " is playing football");
    }

    void walk(int steps)
    {
        System.out.println(name+ "is Walking "+steps+" steps");
    }

}


public class Mainoops{
    public static void main(String[] args) {
        
     student pradip = new student(22, "Pradip");
     pradip.walk(3);


    }
    
}
