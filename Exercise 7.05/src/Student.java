public class Student
{
  private String name;
  private char gender;
  private int number;

  public Student()
  {
  }

  public Student(String nam, char gen, int num)
  {
    name = nam;
    gender = gen;
    number = num;
  }

  public void setName(String nam)
  {
    name = nam;
  }

  public void setGender(char gen)
  {
    gender = gen;
  }

  public void setNumber(int num)
  {
    number = num;
  }

  public String getName()
  {
    return name;
  }

  public char getGender()
  {
    return gender;
  }

  public int getNumber()
  {
    return number;
  }

  public String toString()
  {
    return (name + " " + gender + " " + number);
  }
}
