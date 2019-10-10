public class Person
{
  private String name;
  private String maritalStatus;
  private int numberOfChildren;

public Person(String name)
{
  this.name=name;
  numberOfChildren=0;
}
public void setName(String n)
{
  name=n;
}
public void addChild(int c)
{
  numberOfChildren = numberOfChildren + c;
}
public void setMaritalStatus(String m)
{

  if(m.equals("Married") || m.equals("Single")){
    maritalStatus=m;
  }
  else System.out.println("Error, Only Married or Single as options");
}
/*public boolean isSingle()
{
*//*if(maritalStatus=="Married"){
  return
}*//*
}*/


}
