public class RoomListTest
{
  public static void main(String[] args)
  {
    Room room1 = new Room(40);
    Room room2 = new Room(100);
    room2.setHasHDMI(true);
    Room room3 = new Room(10);

    RoomList list = new RoomList();
    list.addRoom(room1);
    list.addRoom(room2);
    list.addRoom(room3);

    System.out.println(list.getAllRoomsWithMinimumCapacity(40));
  }
}
