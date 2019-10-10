public class Car
{
  private String car;
  private String colour;
  private String registration;

  public Car(String c,String col,String reg){
    car=c;
    colour=col;
    registration=reg;
  }
  public String getCar()
  {
    return car;
  }
  public String getColour(){
    return colour;
  }
  public String getRegistration(){
    return registration;
  }
  public void setCar(String c){
    car=c;
  }
  public void setColour(String col){
    colour=col;
  }
  public void setRegistration(String reg){
    registration=reg;
  }

}
