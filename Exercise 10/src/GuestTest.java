public class GuestTest
{
  public static void main(String[] args)
  {
    Guest guest1 = new Guest("John");
    Guest guest2 = new Guest("Peter");
    System.out.println(guest1.getName());
    System.out.println(guest1.equals(guest2));
  }
}
