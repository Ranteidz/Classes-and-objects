public class Point
{
  private int x;
  private int y;

  public Point(int xe,int ye)
  {
    this.x=xe;
    this.y=ye;
  }

  public int getX()
  {
    return x;
  }

  public int getY()
  {
    return y;
  }
   public void moveTo(int newX,int newY)
   {
     x=newX;
     y=newY;
   }
   public void move(int xDistance,int yDistance)
   {
     x=x+xDistance;
     y=y+yDistance;
   }
   public String toString()
   {
     return x+","+y;
   }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Point))
    {
      return false;
    }
    Point other = (Point) obj;
    return  x == other.getX()
        && y == other.getY();
  }

}
