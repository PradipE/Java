package Class;
class Employee
{
     int emId;
     public  int getEmId()
     {
        return emId;
     }
     public int setEmId(int emId)
     {
       return this.emId =emId;
     }
}


public class Class
{
    public static void main(String[] args) {

         // in that Employee class We have a sinle variable that located in a memeory when ever that change that  will directly reference to that variable
        Employee emObj = new Employee();
        Employee emObj2 =new Employee();
        emObj.emId =10;
        System.out.println(emObj.emId);
        modifyObj(emObj);
        System.out.println(emObj.emId);
        emObj2.emId =33;
        System.out.println(emObj2.emId);

    }

    public static  void  modifyObj(Employee employee/*This is a class variable */)
    {
         employee.emId=22;
    }
}
