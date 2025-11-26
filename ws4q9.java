import java.util.Scanner;

/**
 * Write a description of class ws4q9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ws4q9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your gpa");
        float gpa = sc.nextFloat();
        System.out.print("Enter your attendance %");
        float attendance = sc.nextFloat();
        System.out.print("Enter you attitude on a scale of 1-10");
        int attitude= sc.nextInt();
        
        if(gpa>=3.2 && gpa<=4.0)
        {
           if(attendance>=80) 
           {
               if (attitude<5)
               {
                  System.out.println("Eligible for Scholarship"); 
               }
               else
               {
                  System.out.println("Attitude Not enough"); 
               }
           }
           else
           {
               System.out.println("Attendance Not enough");
           }
        }
        else
        {
            System.out.println("Not eligible scholarship");
        }
    }
}