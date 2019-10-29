public class Fish extends Animal
{
  private int weight;
  public Fish(int speed,String name, int weight){
    super(speed,name);
    this.weight=weight;
  }

  public String makeAnimalSound(){
    return "duuh";
  }




}
