
import java.util.Scanner;

public class ifelse {
	 
    public static void main(String[] args) 
	{
        System.out.print("Enter your name: ");
		 Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();


        switch (name) 
		{
            case "Akku" : 
			
                System.out.println( name + " You are going to become an Adult!");
			
                
            
			break;
            case "Kalash": 
			System.out.println( name + " You are going to join a Job!");
			
			break;
            case "Little" :
						System.out.println( name + " You are going to get retired!");
			
			break;
            default : System.out.println("Enjoy Your life!");
        }
        System.out.println("Thanks for using my Java Code!");


        
        
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();
        if (age>56){
            System.out.println("You are experienced!");
        }
        else if(age>46){
            System.out.println("You are semi-experienced!");
        }
        else if(age>36){
            System.out.println( "You are semi-semi-experienced!");
        }
        else{
            System.out.println("You are not experienced");
        }
        if(age>2){
            System.out.println("You are not a baby!");
        }
        

    }
}
