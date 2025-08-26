package Interface;
 interface Person
{
   public String profession(); 
}

 class Teacher implements Person{
        
    public String profession()
    {
        return "teaching";
    }
}

class Student implements Person{
    
    
    public String profession()
    {
        return "Software Engineer";
    }
}


public class Interface {
    public static void main(String[] args) {
        Person teacher = new Teacher();
        Teacher teacher1 =new Teacher();
        System.out.println(teacher1.profession());
       

    }
}
