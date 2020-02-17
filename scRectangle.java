import java.util.*;

public class scRectangle{

  public static void main(String[] args){

    int length, width, perimeter, area;

    Scanner sc = new Scanner(System.in);
    System.out.println("Please state the length of the rectangle.");
    length = sc.nextInt();
    System.out.println("Please state the width of the rectangle.");
    width = sc.nextInt();
    System.out.println("\nWe have a rectangle with the width of " + length + " meters" +
                      " and the length of " + width + " meters.");
    perimeter = 2*(length + width);
    System.out.println("\nTo find its perimeter, we do width x 2 + length x 2 = "
                        + perimeter + " meters.");
    area = length*width;
    System.out.println("\nTo find its area, we do length x width = " + area + " square meters.");

  }

}
