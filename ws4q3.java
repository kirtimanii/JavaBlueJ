import java.util.Scanner;

/**
 * Workshop question no 3
 *
 * K
 * v1.0
 */
public class ws4q3
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number");
        int num = sc.nextInt();
        
        if(num>0) 
        {
           System.out.println("It is positive"); 
        }
        else if(num < 0)
        {
          System.out.println("It is negative");  
        }
        else 
        {
            System.out.println("It is zero");
        }
    }
}