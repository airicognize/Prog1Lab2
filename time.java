import java.util.*;

public class time{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	    
	System.out.print("Please state seconds you wish to convert>");
        int seconds = sc.nextInt();
        double minutes = seconds/60;
        int secondleft = seconds%60;

        System.out.println((int)minutes + ":" + secondleft);
    }
}
