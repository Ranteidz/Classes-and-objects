import java.io.IOException;

public class House extends Home
{
  private double price;

public House(String address, double price){
  super(address);
  this.price=price;
}
public String getInfo(){
  return super.getAddress() +" "+ price;
}

  @Override public String toString()
  {
    return getInfo();
  }

  @Override public boolean equals(Object obj)
  {
    if(!(obj instanceof House))
    {
      return false;
    }
    House other = (House) obj;
    return super.equals(other) && this.price==other.price;
  }

}
