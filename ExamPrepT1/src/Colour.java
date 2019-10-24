public class Colour
{
  private int red;
  private int green;
  private int blue;

  public Colour(int red, int green, int blue){
    this.red=red;
    this.green=green;
    this.blue=blue;
  }
  public void setColour(int red,int green,int blue){
    this.red=red;
    this.green=green;
    this.blue=blue;

  }

  public int getRed()
  {
    return red;
  }

  public int getGreen()
  {
    return green;
  }

  public int getBlue()
  {
    return blue;
  }
  public boolean isGray(){
    if(getRed()==getGreen()&&getRed()==getBlue()){
      return true;
    }
    else return false;
  }
  public void mixWith(Colour colour2){
    {
      double red1 = red;
      double red2 = colour2.red;
      double redF;


    redF = red1 * 0.5 + red2 * 0.5;
    this.red = (int) redF;
    }



  }

}
