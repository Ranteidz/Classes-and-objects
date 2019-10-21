import java.util.ArrayList;

public class RoomList
{

  private ArrayList<Room> rooms;

  public RoomList()
  {
    rooms = new ArrayList<Room>();
  }

  public void addRoom(Room room)
  {
    rooms.add(room);
  }

  public void removeRoom(Room room)
  {
    rooms.remove(room);
  }

  public String toString()
  {
    String returnString = "";
    for (Room room: rooms)
    {
      returnString += room.toString() + "\n";
    }
    return  returnString;
  }

  public int getNumberOfRoomsWithHDMI()
  {
    int counter = 0;
    for (Room room : rooms)
    {
      if(room.hasHDMI())
      {
        counter++;
      }
    }
    return counter;
  }

  public ArrayList<Room> getAllRoomsWithMinimumCapacity(int minCapacity)
  {
    ArrayList<Room> returnList = new ArrayList<Room>();
    for (Room room : rooms)
    {
      if(room.getCapacity() >= minCapacity)
      {
        returnList.add(room);
      }
    }
    return returnList;
  }

}
