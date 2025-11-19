import java.util.Scanner;

/**
 * Write a description of class gradeevaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class gradeevaluator
{
    public static void main(String[] args){
     System.out.println("Coverage of Scanner Class");
      Scanner scan= new Scanner(System.in);
      
      System.out.println("enter your grade:");
      
      int grade= scan.nextInt();
      
      System.out.println("your grade is:"+grade);
      
      String result=( grade>=40) ? "Your result is: \n PASS" : "Your result is: \n FAIL";
      System.out.println(result);
    }
}