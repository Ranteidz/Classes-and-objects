public class Dog extends Animal
{
  private int dailyWalks;
  private int walksToday;

  public Dog(int speed, String name, int dailyWalks)
  {
    super(speed, name);
    this.dailyWalks = dailyWalks;
    this.walksToday = 0;
  }

  public String makeAnimalSound()
  {
    return "Woof";
  }

  public void walk()
  {
    if(walksToday<dailyWalks)
    {
      walksToday++;
      moveTo(positionX + getSpeed(), positionY + getSpeed());
    }



  }
}
