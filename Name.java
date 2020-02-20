/*
This program is used to format your first and last name in a specific way even if you were to
write it with a bunch of uppercases and lowercases.
*/
import java.util.*;

public class Name{

	public static void main(String[] args){

      Scanner sc = new Scanner(System.in);

      System.out.println("Please state your first name, last name.");	

      String name = sc.nextLine();

      int comma = name.indexOf(",");

      String firstName = name.substring(comma + 2);
     
      String lastName = name.substring(0,comma);


      String firstNameStart = firstName.substring(0,1);
      firstNameStart = firstNameStart.toUpperCase();
      String firstNameRemainder = firstName.substring(1);
      firstNameRemainder = firstNameRemainder.toLowerCase();
      firstName = firstNameStart + firstNameRemainder;

      String lastNameStart = lastName.substring(0,1);;
      lastNameStart = lastNameStart.toUpperCase();
      String lastNameRemainder = lastName.substring(1);
      lastNameRemainder = lastNameRemainder.toLowerCase();
      lastName = lastNameStart + lastNameRemainder;

      String fullName = firstName + " " + lastName;
      System.out.println(fullName);
     }    
}
