import java.util.ArrayList;

public class Kindergarten
{

  private int countTeachers;
  private ArrayList<Child> children;

  public Kindergarten()
  {
    children = new ArrayList<Child>();
  }

  public void addChild(Child child)
  {
    children.add(child);
  }
  public void removeChild(Child child){
    children.remove(child);
  }
  public void hireTeachers(int count){
    countTeachers=countTeachers+count;
  }
  public void fireTeacher(){
    countTeachers=countTeachers-1;
  }
  public int countChildren(){
    return children.size();
  }
  public int countTeachers(){
    return countTeachers;
  }
  public double getAverageAge(){
    int agesum=0;
    for(int i =0;i<children.size();i++)
    {

      agesum+=children.get(i).getAge();
    }
    return agesum/children.size();
  }
  public double getNorm(){
    double counter=0;
    for(int i=0;i<children.size();i++)
    {
      counter++;
    }
    return counter/countTeachers;
  }

  public String toString(){
    return children +" "+getAverageAge()+" "+countTeachers+" "+getNorm();
  }
}
