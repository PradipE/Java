
import java.util.Scanner;

public class Input{

    public static void main (String[] args){
      //input 
      
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username: ");
    
        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
      

    }
} 