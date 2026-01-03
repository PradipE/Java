  class Student{
    //So these all are private variable that only read and write only inside this class
     private  String name;

     private  int age;
    private  long  id;
    

    // here Set function

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age=age;

    }
    public void setId(long id)
    {
        this.id = id;
    }

  //get function

  public String getName()
  {
      return name;
  }
  public int getage()
  {
      return age;
  }
  public long getId()
  {
    return  id;
  }
}

public  class Main{
    public static void main(String[] args) {
        Student pradip = new Student();

        pradip.setName("Pradip Mondal");
        pradip.setAge(24);
        pradip.setId(10900221133L);
        

         System.out.println("Name: "+pradip.getName());
         System.out.println("Age: "+pradip.getage());
         System.out.println("Id: "+pradip.getId());
    }
}
