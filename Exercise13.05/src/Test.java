public class Test
{
  public static void main(String[] args)
  {
    JobBase base1= new JobBase("Base1");
    Person person1 = new Student("Tom",251452121,12);
    Person person2 = new Teacher("Bob",1232133,20000,"Math");
    Person person3 = new Secretary("Shanon",122222111,15000,"Luna");

    base1.addPerson(person1);
    base1.addPerson(person2);
    base1.addPerson(person3);
    base1.printAll();
    System.out.println(person1.toString());
    System.out.println(person2.toString());
    System.out.println(person3.toString());
  }


}
