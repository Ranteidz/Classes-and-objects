public abstract class Employee extends Person
{
  private int salary;

  public Employee(String name, int securityNumber, int salary){
    super(name,securityNumber);
    this.salary=salary;
  }

  public int getSalary()
  {
    return salary;
  }

  public void setSalary(int salary)
  {
    this.salary = salary;
  }

  public abstract int payRent();

}
