import java.util.Scanner;

/**
 * Write a description of class mathoperation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mathoperation
{
    public static void main(String[] args)
    {
        int a= 10;
        int b= 15;
        int sum= a+b;
        int diff= b-a;
        int pro= a*b;
        
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(pro);
        
        
        System.out.println(a == b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a!=b);
        
        int c= 1;
        
        System.out.println(++c); // ++c=2
        System.out.println(c); // c=2
        
        
        System.out.println(c++); // c++=2
        System.out.println(c); // c=3
        
        int d= 3;
        
        int remainder=c%d;
        System.out.println(remainder);
        
        
        System.out.println("Coverage of Scanner Class");
        Scanner scan= new Scanner(System.in);
      
        System.out.println("enter your age");
      
        int age= scan.nextInt();
      
        System.out.println("your age is:"+age);
        // ternery operator
        String oldage=( age>= 18) ? "You are an Adult" : "You are a Minor";
        System.out.println(oldage);
       
       
        
    }
}