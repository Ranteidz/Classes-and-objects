public class Job
{
  private String title;
  private double salary;
  private Person employee;
  private MyDate birthday;

  public Job(String title,double salary,Person employee,MyDate birthday)
  {
    this.title=title;
    this.salary=salary;
    this.employee=employee;
    this.birthday=birthday.copy();
  }
  public Job(String title,double salary)
  {
    employee=null;
    this.title=title;
    this.salary=salary;
  }

  public String getTitle()
  {
    return title;
  }
  public double getSalary()
  {
    return salary;
  }
  public String getEmployee()
  {
    return employee.getName();
  }
  

  public void setTitle(String title)
  {
    this.title = title;
  }
}
