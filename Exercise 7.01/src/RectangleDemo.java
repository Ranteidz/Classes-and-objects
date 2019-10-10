import java.util.Scanner;

public class RectangleDemo
{
  public static void main(String[] args)
  {
    Scanner input=new Scanner(System.in);

    System.out.println("blabla");



    Rectangle rec1=new Rectangle(10,15);
    System.out.println(rec1.getArea()+" This is the area");
    System.out.println(rec1.getLength()+" This is the length");
    System.out.println(rec1.getWidth()+" This is the width");

    rec1.setLength(input.nextInt());
    rec1.setWidth(input.nextInt());
    System.out.println(rec1.getWidth()+" "+rec1.getLength()+" "+rec1.getArea());

  }
}
