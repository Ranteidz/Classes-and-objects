public class Cat extends Animal
{
private int numberOfLives;

public Cat(int speed,String name, int numberOfLives){
  super(speed,name);
  this.numberOfLives=numberOfLives;
}
public String makeAnimalSound(){
  return "Meow";
}
public void decreaseLives(){
  numberOfLives= numberOfLives -1;

}

}
