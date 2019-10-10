public class Room
{
  private int number;
  private Guest name;
  private Bed type;

  public Room(int number, String type)
  {
    this.number = number;
    this.type = new Bed(type);

  }

  public int getNumber()
  {
    return number;
  }

  public int getFloor()
  {
    while (number >= 10)
    {
      number /= 10;

    }
    return number;

  }

  public double getPrice()
  {
double price=0;
if(type.isSingle()){
  price=59.50;
  }
if(type.isDouble()){
  price=72.40;
}
if(type.isKingSize()){
  price=89.00;
}
return price;
}
/*public boolean isOccupied(){
    return
}*/

public void registerGuest(Guest name){
this.name=name;
}

}