public class RoomTest
{
  public static void main(String[] args)
  {
    Room room1= new Room(820,"double");
    System.out.println(room1.getFloor());
    Guest guest1 = new Guest("peter");

    room1.registerGuest(guest1);
    System.out.println(room1.getPrice());
    System.out.println();
    
  }
}
