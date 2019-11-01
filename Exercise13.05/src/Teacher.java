public class Teacher extends Employee
{
  private String subject;

  public Teacher(String name,int securityNumber,int salary,String subject){
    super(name,securityNumber,salary);
    this.subject=subject;
  }

  public String getSubject()
  {
    return subject;
  }

  public void setSubject(String subject)
  {
    this.subject = subject;
  }
  public String saySomething(){
    return "I like teaching";
  }
  public int solveProblem(){
    return 5000/2*5*5*4;
  }
  public String toString(){
    return super.toString() + " My subject is : "+subject;
  }

  @Override public int payRent()
  {
    return getSalary()/2;
  }
  public boolean equals(Object obj){
    if(!(obj instanceof Teacher)){
      return false;
    }
    Teacher other= (Teacher) obj;
    return super.equals(other) && this.subject.equals(other.subject);
  }
}
