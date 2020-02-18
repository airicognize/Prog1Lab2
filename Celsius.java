import java.util.*;

public class Celsius{

	public static void main(String[] args){

	    Scanner sc = new Scanner(System.in);

	    System.out.println("Please state the temperature in Celsius in the past 3 days.");
	    
	    float c1 = sc.nextFloat();
	    float c2 = sc.nextFloat();
	    float c3 = sc.nextFloat();

	    float average = (c1+c2+c3)/3f;

	    System.out.printf("The average celsius in the past 3 days is " + "%.2f", average);
	}    
}