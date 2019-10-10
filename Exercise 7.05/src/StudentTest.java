public class StudentTest
{
  public static void main(String[] args)
  {
    Student stud = new Student();

    stud.setGender('M');
    System.out.println(stud.toString());
    stud.setName("Peter");
    stud.setNumber(1298128912);
    System.out.println(stud.toString());
  }
}
