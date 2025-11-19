
/**
 * Week-3 : Workshop
 *
 * K
 * v1.0
 */
public class workshop
{
    int age; // instance variable
    static int qty; // static variable
    
    public static void main(String[] args)
    {
        // <className> <variable>= new <className>();
        
        int age=17; // local variable
        
        workshop v1= new workshop(); // calling instance variable in static method
        System.out.println(v1.age);
        
        System.out.println(age);
        System.out.println(workshop.qty);
        
        
    }
    
    
}