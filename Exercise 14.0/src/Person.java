public class Person
{
  private String name;
private Home home;

  public Person(String name, Home home)
  {
    this.name = name;
    this.home =  home;

  }
  public String getHomeInfo(){
    return home.getInfo();
  }
  public String toString(){
    return this.name + " " + getHomeInfo();
  }
  public boolean equals(Object obj){
    if(!(obj instanceof Person))
    {
      return false;
    }
    Person other = (Person) obj;
    return this.name.equals(other.name) && this.getHomeInfo().equals(other.getHomeInfo());
  }
}
