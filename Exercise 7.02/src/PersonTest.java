public class PersonTest
{
  public static void main(String[] args)
  {
    MyDate thisDate= new MyDate(12,2,2000);
    Person jerry = new Person("tom",thisDate);

    System.out.println(jerry.toString()+" "+thisDate.toString());
    Person bob= new Person(thisDate);
    System.out.println(bob.toString());
    bob.setName("Bob");
    System.out.println(bob.toString());
    System.out.println(bob.getBirthday());
    System.out.println(bob.getName());
    jerry.setName("Bob");
    System.out.println(bob.equals(jerry));
  }
}
