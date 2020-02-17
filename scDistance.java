import java.util.*;

public class scDistance{

  public static void main(String[] args){

    double converter, meter, feet;

    Scanner sc = new Scanner(System.in);
    System.out.println("Please state the the amount of meters you wish for us to convert to feet.");
    meter = sc.nextDouble();
    feet = 3.281;
    converter = meter * feet;

    System.out.println("\nThe distance of " + (int)meter + " units in meters is equal to " + converter + " feet.");

  }

}
