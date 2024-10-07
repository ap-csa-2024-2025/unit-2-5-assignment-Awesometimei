import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    //Problem 1
    Circle circle1 = new Circle(10.1);
    Circle circle2 = new Circle(14.0);
    Circle circle3 = new Circle(20.5);

    System.out.println(circle1.toString());
    System.out.println(circle2.toString());
    System.out.println(circle3.toString());

    //Problem 2
    System.out.println("Type a number for length and width");
    double dim1 = sc.nextDouble();
    System.out.println("Type a number for length");
    double len = sc.nextDouble();
    System.out.println("Type a number for =width");
    double width = sc.nextDouble();

    Rectangle rec1 = new Rectangle(dim1);
    Rectangle rec2 = new Rectangle(len, width);
    System.out.println(rec1.toString());
    System.out.println(rec2.toString());

    //Problem 3
    System.out.println("Type a side length: ");
    double sideLen = sc.nextDouble();
    RegularPolygon tri1 = new RegularPolygon(sideLen);
    RegularPolygon squ1 = new RegularPolygon(4,sideLen);
    
    System.out.println(tri1.toString());
    System.out.println(squ1.toString());

  }
}

