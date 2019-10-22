public class Person
{
  private String name;
  private String address;
  private MyDate birthday;
  private Brain brain;

  public Person(String name, String address, MyDate birthday)
  {
    this.name = name;
    this.address = address;
    this.birthday = new MyDate().copy();
  }

  public Person(String address, MyDate birthday)
  {
    name = null;
    this.address = address;
    this.birthday = new MyDate().copy();
  }

  public Person(MyDate birthday)
  {
    name = null;
    address = null;
    this.birthday = new MyDate().copy();
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getAddress()
  {
    return address;
  }

  public void setAddress(String address)
  {
    this.address = address;
  }

  public String getBirthday()
  {
    return this.birthday.copy().toString();
  }

  public int getIq()
  {
    return brain.getIq();
  }

  public boolean isBrainDamaged()
  {
    return brain.isBrainDamaged();
  }

  public boolean doYouRemember(String topic)
  {
    return brain.recall(topic);
  }

  public void rememberThisTopic(String topic)
  {
    if (!brain.recall(topic))
    {
      brain.remember(topic);
    }
    if (brain.recall(topic))
    {
      brain.refreshMemory(topic);
    }
  }
  public String whatAreYouThinkingAbout(){
    return brain.recall();
  }
  public String toString(){
    return name + " "+address+" "+birthday.copy()+" "+brain;

  }
public boolean equals(Object obj)
{
  if(!(obj instanceof Person)){
    return false;
  }
  Person other = (Person) obj;
  return name.equals(other.getName()) && address.equals(other.getAddress()) && birthday.equals(other.getBirthday()) && brain.equals(other.brain);
}
}
