//To swap the values of two variables (Without using third variable).

import java.util.* ;
public class swapping
 {
  public static void main(String[] args) 
{
    int a;
    int b;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter Number for a= " + " and for b=");
    a=scan.nextInt();
    b=scan.nextInt();
    System.out.println("Before Swapping a= "+ a + " and b="+b);
    a = a+b;
    b = a - b;
    a = a - b;

    System.out.println("Number swapped for a= " + a + " and b= "+b);
  }
}