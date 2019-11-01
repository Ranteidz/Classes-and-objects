import java.util.ArrayList;

public class Testing
{

  public static void main(String[] args)
  {
    Home apartment1 = new Apartment("blabla",2000000);
    Home house1 = new House("tralialialia", 500000);

    System.out.println(house1.getInfo());
    Person person1 = new Person("Bob",apartment1);
    Person person2 = new Person("Tom",house1);
    Person person3 = new Person("Tom",house1);

    System.out.println(person1.getHomeInfo());
    System.out.println(person1.toString());

    ArrayList<Person> persons = new ArrayList<Person>();

    persons.add(person1);
    persons.add(person2);
    persons.add(person3);

    System.out.println(persons.toString());
    System.out.println(person2.equals(person3));
  }
}
