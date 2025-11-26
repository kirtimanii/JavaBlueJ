import java.util.Scanner;

/**
 * Write a description of class ws4q7 here.
 *
 * K
 * v1.0
 */
public class ws4q7
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
        
        switch(category)
        {
            case 'A': 
                sp=mp-(mp * 0.6);
                System.out.println(sp);
            break;
            case 'B': 
                 sp=mp-(mp * 0.4);
                System.out.println(sp);
            break;
            case 'C': 
                 sp=mp-(mp * 0.2);
                System.out.println(sp);
            break;
            case 'D': 
                 sp=mp-(mp * 0.1);
                 System.out.println(sp);
            break;

        
        }
        
        
    }
}