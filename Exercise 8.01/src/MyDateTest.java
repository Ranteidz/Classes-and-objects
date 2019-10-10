import java.util.Scanner;

public class MyDateTest
{
  public static void main(String[] args)
  {
    int dayinput, monthinput,yearinput;
    Scanner input=new Scanner(System.in);
 dayinput=input.nextInt();
 monthinput=input.nextInt();
 yearinput=input.nextInt();
    MyDate date = new MyDate(31,12,2000);
    System.out.println(date.getMonthName());
    System.out.println(date.isLeapYear());
    System.out.println(date.numberOfdaysMonth(date.getMonth()));
   date.StepForwardOneDay();
    System.out.println(date.toString());


  }
}
