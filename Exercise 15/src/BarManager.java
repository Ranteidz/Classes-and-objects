import java.util.ArrayList;

public class BarManager implements Establishment
{
  private ArrayList<Establishment> establishment;



public BarManager(){
 establishment = new ArrayList<Establishment>();
}
public void addEstablishment (Establishment establishment){
this.establishment.add(establishment);

}
public ArrayList<Establishment> getAllEstablishment()
{
  return establishment;
}
public ArrayList<Establishment> getEstablishmentsThatServeAlcohol(){
  for (Establishment member: establishment
       )
  {
    if(establishment.){
      return member
    }
  }
}






  @Override public String getName()
  {
    return null;
  }

  @Override public String getOpeningHours()
  {
    return null;
  }

  @Override public String getAddress()
  {
    return null;
  }

  @Override public ArrayList<Food> getMenu()
  {
    return null;
  }

  @Override public ArrayList<Beverage> getBeverages()
  {
    return null;
  }

  @Override public boolean isOpenAt(String openingHours)
  {
    return false;
  }

  @Override public ArrayList<Beverage> getAllAlcoholicBeverages()
  {
    return null;
  }
}
