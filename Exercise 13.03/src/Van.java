public class Van extends Car
{
  private int maxLoad;

  public Van(String theOwner, double thePrice, String regNo, int maxLoad)
  {
    super(theOwner, thePrice, regNo);
    this.maxLoad = maxLoad;
  }

  public int getMaxLoad()
  {
    return maxLoad;
  }

  public String toString()
  {
    return super.toString() + "\n" + maxLoad;
  }
/*
  public boolean equals(Object arg)
  {
    if (!(arg instanceof Van))
    {
      return false;
    }*/
/*
<<<<<<< HEAD
    Van other = (Van) arg;
    return super.equals(other) && this.maxLoad == other.maxLoad;
=======
    Van other= (Van) arg;
    return super.equals(other) && this.maxLoad==other.maxLoad;
>>>>>>> 80abbc72ee8a4a41a6117f23df463d3741981124
  }
}
*/
}