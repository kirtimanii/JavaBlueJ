import java.util.Scanner;

/**
 * Calculation of Rickshaw Fare
 *
 * K
 * v1.0
 */

public class RickshawFare 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Distance in km");
        int distance = sc.nextInt();

        System.out.print("Time in mins");
        int time = sc.nextInt();

        System.out.print("Are you a local person? (yes or no): ");
        String local = sc.next().toLowerCase();
        
        // ternery is used here:
        int localyes = local.equals("yes") ? 1 : 0;

        System.out.print("Is it night time? (yes/no): ");
        String night= sc.next().toLowerCase();
        
        //ternery is used here:
        int nightyes = night.equals("yes") ? 1 : 0;  

        int base = 50; // the base price for each and every ride is 50
        int km = 20; // the price for per km in every ride is 20
        int min = 2; // the price for per minute in every ride is 2

       
        int discount = (localyes == 1 && distance > 10) ? 20 : 0;
        int nightextra = (nightyes == 1) ? 30 : 0;

       
        int total = base+(distance*km)+(time * min)+ nightextra - discount;

        System.out.println("Total Price: Rs. " + total);
    }
}
