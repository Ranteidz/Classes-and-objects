import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class JobBase
{
  private String baseName;
  private ArrayList<Person> people;

  public JobBase(String baseName){
    this.baseName=baseName;
    people = new ArrayList<Person>();
  }

  public String getBaseName()
  {
    return baseName;
  }

  public void setBaseName(String baseName)
  {
    this.baseName = baseName;
  }
  public void addPerson(Person person){

    people.add(person);

  }
  public void removePerson(Person person){
    people.remove(person);
  }
  public String printAll(){

    for (Person persons: people
         )
    {
      System.out.println("Name : " + persons.getName()+" Security number: "+persons.getSecurityNumber());
    }
return null;
}

}