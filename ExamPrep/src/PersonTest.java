public class PersonTest
{
  public static void main(String[] args)
  {
MyDate date1 = new MyDate(12,12,12);
Brain brain1 = new Brain();
Person person1= new Person("Tom","blabla 98",date1);
    Person person2= new Person("Tom","blabla 98",date1);
    System.out.println(person1.toString());
    System.out.println(person1.equals(person2));
    System.out.println(person1.getBirthday());
  }
}
