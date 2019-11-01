public class Student extends Person
{
private int gradeAverage;

public Student(String name, int securityNumber, int gradeAverage){
  super(name,securityNumber);
  this.gradeAverage=gradeAverage;
}

  public int getGradeAverage()
  {
    return gradeAverage;
  }

  public void setGradeAverage(int gradeAverage)
  {
    this.gradeAverage = gradeAverage;
  }
  public String saySomething(){
  return "I like parties";
  }
  public int solveProblem(){
  return 2000/12*2/2*6/2;
  }
  public String toString(){
  return super.toString() + " Average grade : " + this.gradeAverage;

  }
  public boolean equals(Object obj){
  if(!(obj instanceof Student))
  {
    return false;
  }
    Student other= (Student) obj;
    return super.equals(other) && this.gradeAverage==other.gradeAverage;

  }
}
