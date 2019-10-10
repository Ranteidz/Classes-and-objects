public class Person
{
  private String name;
  private MyDate birthday;

  public Person(String n, MyDate birthday)
  {
    this.name = n;

    this.birthday = birthday.copy();

  }

  public Person(MyDate birthdayDate)
  {
    name="No name";
    this.birthday = birthdayDate.copy();
  }




  public String getName()
  {
    return name;
  }

  public MyDate getBirthday()
  {
    return birthday.copy();
  }

  public void setName(String n)
  {
    name = n;
  }


public String toString(){
    return name+" "+birthday;
}
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Person))
    {
      return false;
    }
    Person other = (Person) obj;
    return  name == other.getName()
        && birthday.equals(other.getBirthday());
  }

}
