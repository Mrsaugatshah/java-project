
//Types of constructor
import java.util.Scanner;

public class area {
  int a, b, c;

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int length, breadth, radius;
    System.out.print("Enter length and breadth of rectangle:");
    length = sc.nextInt();
    breadth = sc.nextInt();
    System.out.print("Enter radius of circle:");
    radius = sc.nextInt();
    Area obj1 = new Area(length, breadth);
    Area obj2 = new Area(radius);
    Area obj3 = new Area();
  }

  Area(int r)//Parameterized constructor
    {
        System.out.println("Area of circle:"+(3.14*r*r));
    }

  Area(int l,int b)//Parameterized constructor
    {
        System.out.println("Area of rectangle="+(l*b));
    }

  Area()//no argument constructor
    {
        a=0;
        b=0;
        c=0;
    }
}