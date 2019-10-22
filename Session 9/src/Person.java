public class Person
{
  private String name;
  private MyDate birthday;

  public Person(String name, MyDate birthday)
  {
    this.name = name;
    this.birthday = new MyDate().copy();

  }

  public Person(MyDate birthday)
  {
    name = null;
    birthday = new MyDate().copy();
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public MyDate getBirtday()
  {
    return new MyDate().copy();
  }

  /* public int getAge(){

   }*/
  public String toString()
  {
    return name + " " + getBirtday();
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Person))
    {
      return false;
    }
    Person other = (Person) obj;
    return name == other.name && getBirtday() == other.getBirtday();
  }

}
