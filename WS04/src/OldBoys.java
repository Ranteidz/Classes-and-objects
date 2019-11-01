public class OldBoys extends ClubMember
{
  private int yearsOfMembership;

  public OldBoys(String name, int age, int yearsOfMembership)
  {
    super(name, age);
    this.yearsOfMembership = yearsOfMembership;
  }

  public int getYearsOfMembership()
  {
    return yearsOfMembership;
  }

  public void setYearsOfMembership(int yearsOfMembership)
  {
    this.yearsOfMembership = yearsOfMembership;
  }

  @Override public String toString()
  {
    return super.toString() +" "+ yearsOfMembership;
  }

  public double getMembershipFee()
  {
    if (yearsOfMembership < 5)
    {
      return 300;
    }
    if (yearsOfMembership >= 5 && yearsOfMembership <= 9)
    {
      return 200;
    }
    if (yearsOfMembership > 9)
    {
      return 100;
    }
    else
      return -1;
  }
}
