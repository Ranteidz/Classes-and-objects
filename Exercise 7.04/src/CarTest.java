public class CarTest
{
  public static void main(String[] args)
  {
    Car vehicle=new Car("BMW","Silver","CK80452");

    System.out.println(vehicle.getCar()+" "+vehicle.getColour()+" "+vehicle.getRegistration());

    vehicle.setCar("Audi");
    vehicle.setColour("Black");
    vehicle.setRegistration("JP283000");
    System.out.println(vehicle.getCar()+" "+vehicle.getColour()+" "+vehicle.getRegistration());
  }
}
