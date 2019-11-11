public class Apartment extends Home
{
  private double rent;


  public Apartment(String address,double rent){
    super(address);
    this.rent=rent;
  }

  public String getInfo() {
    return super.getAddress() + " " + rent;
  }

  @Override public String toString()
  {
    return getInfo();
  }

  @Override public boolean equals(Object obj)
  {
    if(!(obj instanceof Apartment)){
      return false;
    }
    Apartment other = (Apartment) obj;
    return super.equals(other) && this.rent==other.rent;
  }
}
