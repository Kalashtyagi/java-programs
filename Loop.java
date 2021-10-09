import java.util.Scanner;
public class Loop
{
  public static void main(String[] args)
{
   
/*  //print even and odd number....
   System.out.println("Even Number\todd number");
   for(int i=1;i<=10;i++)
{
  System.out.print(2*i);
  System.out.print("\t\t" + (2*i-1));
  System.out.println();
    
}     System.out.println("_________________________________");
    System.out.print("continue and break......");
    for(int i=7;i>0;i--){  
        if(i==3){  
            continue;//continue skips the rest statement
        }  
        System.out.println(i);  
        if(i==2)
         break;
    }                                    */
    


        // Practice Problem 1
       int a = 4;
        for (int i=a; i>0; i--){
            for(int j=0;j<i;j++){
               System.out.print("*");
           }
            System.out.print("\n");
       }
      System.out.println("_____________________________________");
        // Practice Problem 2
        int sum=0;
        int b=4;
       for(int i=0;i<b;i++){
           sum = sum + (2*i);
       }
       System.out.print("Sum of even numbers is: ");
        System.out.println(sum);
        // First 4 even numbers are - 0 2 4 6
      
      System.out.println("________________________________________________");
        // Practice Problem 3
        int c = 5;
      //for(int i=0; i<10; i++) - Goes from i=0 to i=9
       for(int i=1;i<=10;i++){
          System.out.printf("%d X %d = %d\n", c, i, c*i);
       }

        // Practice Problem 4
       int d = 10;
        //for(int i=0; i<10; i++) - Goes from i=0 to i=9
        for(int i=10;i>=1;i--){
            System.out.printf("%d X %d = %d\n", d, i, d*i);
        }

        // Practice Problem 6
        int e = 5;
       // What is factorial n = n * n-1 * n-2 ..... 1
        // 5! = 5*4*3*2*1 = 120
        int i = 1;
        int factorial = 1;
        while(i<=e){
            factorial *= i;
            i++;
        }
        System.out.println(factorial);
    
  System.out.pritntln("________________________________________________");
        int e1 = 4;
         int factorial1 =1;
        for(int i=1;i<e1;i++)
    {
        factorial* = i;
    }
      System.out.println(factorial1);
}

        // Practice Problem 9
        int x = 8;
        int sum1 = 0;
        //for(int i=0; i<10; i++) - Goes from i=0 to i=9
        for(int i=1;i<=10;i++){
            sum1 += x*i;
        }
        System.out.println(sum1);

    }
}




