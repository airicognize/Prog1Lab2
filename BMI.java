//This program is used to convert your weight in pounds to kgs and heigh from feet to meters in order to calculate your BMI.

import java.util.*;

public class BMI{

	public static void main(String[] args){

	    Scanner sc = new Scanner(System.in);

	    System.out.println("Please state your weight in pounds and height in feet in order for us to caluclate your BMI.");
	    float weightp = sc.nextFloat();
	    float heightf = sc.nextFloat();

	    float weightkg = weightp*(0.453592f);
	    float heightm = heightf*(0.3048f);

	    System.out.printf("Your BMI is = " + (weightkg/(heightm*heightm)));
    }
}
