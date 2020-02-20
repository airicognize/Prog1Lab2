/*
This program is used to make an average of 4 whole numbers that the user has stated.
*/

import java.util.*;

public class scIntAverage{

  public static void main(String[] args){

    int n1,n2,n3,n4,average;

    Scanner sc = new Scanner(System.in);
    System.out.println("Please state 4 whole numbers you wish for us to make an average of.");

    n1 = sc.nextInt();
    n2 = sc.nextInt();
    n3 = sc.nextInt();
    n4 = sc.nextInt();
    average = (n1+n2+n3+n4)/4;

    System.out.println("The average of " + n1 + "," + n2 + "," + n3 + "," + n4 + " is " + average + ".");


  }

}
