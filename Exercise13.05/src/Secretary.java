public class Secretary extends Employee
{
  private String catName;

  public Secretary(String name, int securityNumber, int salary, String catName)
  {
    super(name, securityNumber, salary);
    this.catName = catName;
  }

  public String getCatName()
  {
    return catName;
  }

  public void setCatName(String catName)
  {
    this.catName = catName;
  }

  public String saySomething()
  {
    return "I like cats";

  }
  public int payRent(){
    return getSalary()/3;
  }

  public String toString(){
    return super.toString() +" Cat name : " + catName;
  }
  public boolean equals(Object obj){
    if(!(obj instanceof Secretary)){
      return false;
    }
    Secretary other= (Secretary) obj;
    return super.equals(other) && this.catName.equals(other.catName);
  }


}
