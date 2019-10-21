public class Room
{

  private boolean hasHDMI;
  private int capacity;

  public Room(int capacity)
  {
    this.capacity = capacity;
    hasHDMI = false;
  }

  public boolean hasHDMI()
  {
    return hasHDMI;
  }

  public int getCapacity()
  {
    return  capacity;
  }

  public void setHasHDMI(boolean hasHDMI)
  {
    this.hasHDMI = hasHDMI;
  }

  public void setCapacity(int capacity)
  {
    this.capacity = capacity;
  }

  public String toString()
  {
    return "Capacity: " + capacity + " AND HasHDMI: " + hasHDMI;
  }

}
