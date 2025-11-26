import java.util.Scanner;

/**
 * Write a description of class ws4q6 here.
 *
 * K
 * v1.0
 */
public class ws4q6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Marked Price of your Product");
        double mp = sc.nextDouble();
        System.out.print("Enter the Category your Product ( Categories: A , B , C & D)");
        char category = sc.next().charAt(0);
        System.out.println(category);
        double sp;
        
        if ( category== 'A')
        {
            sp=mp-(mp * 0.6);
            System.out.println("Your total price is" +sp);
        }
        else if ( category=='B')
        {
            sp=mp-(mp * 0.4);
            System.out.println("Your total price is" +sp);
        }
        else if ( category=='C')
        {
            sp=mp-(mp * 0.2);
            System.out.println("Your total price is" +sp);
        }
        else if ( category=='D')
        {
            sp=mp-(mp * 0.1);
            System.out.println("Your total price is" +sp);
        }
        else
        {
            sp=mp;
            System.out.println("Your total price is" +sp);
        }
        
        
    }
}