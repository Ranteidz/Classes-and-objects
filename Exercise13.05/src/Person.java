public class Person
{
  private String name;
  private int securityNumber;

  public Person(String name, int securityNumber)
  {
    this.name = name;
    this.securityNumber = securityNumber;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public int getSecurityNumber()
  {
    return securityNumber;
  }

  public void setSecurityNumber(int securityNumber)
  {
    this.securityNumber = securityNumber;
  }

  public String saySomething()
  {
    return "....";
  }

  public int solveProblem()
  {
    return 1 + 1;
  }

  public String toString()
  {
    return "Security number : " + securityNumber + " Name:" + this.name;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Person)) {
    return false;
  }
    Person other = (Person) obj;
    return this.name.equals(other.name)
        && this.securityNumber == other.securityNumber;
  }
}
