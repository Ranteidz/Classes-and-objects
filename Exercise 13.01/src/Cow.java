public class Cow extends Animal
{
  private boolean hasSpots;

  public Cow(int speed,String name,boolean hasSpots){
    super(speed,name);
    this.hasSpots=hasSpots;
    hasSpots=true;
  }
  public String makeAnimalSound(){
    return "Mooo";
  }

}
