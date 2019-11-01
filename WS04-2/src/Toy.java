public abstract class Toy
{
private int suitableAge;

public Toy(int suitableAge){
  this.suitableAge=suitableAge;
}
public abstract String play();

  public int getSuitableAge()
  {
    return suitableAge;
  }

  public void setSuitableAge(int suitableAge)
  {
    this.suitableAge = suitableAge;
  }
  public abstract String toString();
  public boolean equals(Object obj){
    if(!(obj instanceof Toy)){
      return false;
    }
    Toy other = (Toy) obj;
    return this.suitableAge == other.suitableAge;
      }
}
