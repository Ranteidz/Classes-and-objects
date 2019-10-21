import java.util.Scanner;

public class PersonTest
{
  public static void main(String[] args)
  {
    int a,b,c;
    Scanner input= new Scanner(System.in);
    System.out.println("enter some numbiors");
    a=input.nextInt();
    b=input.nextInt();
    c=input.nextInt();
    MyDate tihee= new MyDate(a,b,c);
    Person zmogelis = new Person("Thomas", tihee);
    System.out.println(zmogelis.toString());
    tihee.set(12,12,2000);
    System.out.println(tihee.toString());
  }
}
