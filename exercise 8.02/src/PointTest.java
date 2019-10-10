public class PointTest
{
  public static void main(String[] args)
  {
    Point asis=new Point(2,5);
    System.out.println(asis.toString());
    asis.moveTo(5,6);
    System.out.println(asis.toString());
    asis.move(5,4);
    System.out.println(asis.toString());
    Point asis2= new Point(10,10);
    System.out.println(asis.equals(asis2));
  }
}
