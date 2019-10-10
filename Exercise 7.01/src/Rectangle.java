public class Rectangle

{
  private double length;
  private double width;

  /** 11      * Constructor 12 */
  public Rectangle(double len, double w)
  {
    length = len;
    width = w;
  }

  public double getLength()

  {
    return length;

  }

  /** 42      * The getWidth method returns the value 43      * stored in the width field. 44 */

  public double getWidth()

  {
    return width;

  }

  /** 52      * The getArea method returns the value of the 53      * length field times the width field. 54 */

  public double getArea()

  {
    return length * width;

  }
  public void setLength(double len)
  {
    length=len;
  }
  public void setWidth(double w)
  {
    width=w;
  }
}



