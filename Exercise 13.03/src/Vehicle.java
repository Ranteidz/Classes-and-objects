public class Vehicle
{
  private String owner;
  private double price;

  public Vehicle(String owner,double price){
    this.owner=owner;
    this.price=price;
  }
  public String getOwner(){
    return owner;
  }
  public void setOwner(){
    this.owner=owner;
  }
  public double getPrice(){
    return price;
  }
  public String toString(){
    return owner+"/n"+price;
  }
  public boolean equals(Object arg){
if(!(arg instanceof Vehicle)){
  return false;
}
Vehicle other =  (Vehicle) arg;
return this.owner.equals(other.owner)&& this.price==other.price;
  }
}
