public class KindergardenTest
{

  public static void main(String[] args)
  {
    Child child1= new Child("Peter",3);
    Child child2= new Child("Peterxxxxxx",4);
    Child child3= new Child("Petevvvvvr",5);
    Child child4= new Child("Peteraaaaa",4);
    Child child5= new Child("Petercxxx",6);
    Child child6= new Child("Peterssss",7);
    Child child7= new Child("Peterdddd",2);
    Kindergarten kindergarten1= new Kindergarten();

    kindergarten1.addChild(child1);
    kindergarten1.addChild(child2);
    kindergarten1.addChild(child3);
    kindergarten1.addChild(child4);
    kindergarten1.addChild(child5);
    kindergarten1.addChild(child6);
    kindergarten1.addChild(child7);
    kindergarten1.removeChild(child3);
    kindergarten1.hireTeachers(10);
    System.out.println(kindergarten1);
    System.out.println(kindergarten1.countChildren());
    System.out.println(kindergarten1.countTeachers());
    System.out.println(kindergarten1.getAverageAge());
    kindergarten1.fireTeacher();
    System.out.println(kindergarten1.countTeachers());
    System.out.println(kindergarten1.getNorm());
double teachers =12;
int children =3;
    System.out.println(children/teachers);
  }
}
