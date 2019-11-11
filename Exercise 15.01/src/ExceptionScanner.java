import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionScanner
{

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
    System.out.println("Enter 5 double digit integers");

    while (list.size() <= 5)
    {
      try
      {
        list.add(input.nextInt());
      }
      catch (Exception e)
      {
        System.out.println("Exception");
        input.nextLine();

      }
    }
    System.out.println("end");

    System.out.println("Enter more integers ");

int sum=0;
  for(;;){
   if(!(input.nextLine().equals("End"))){
     try
     {

       sum += input.nextInt();
       System.out.println("The sum is : " + sum);


     }
     catch (Exception e)
     {
       System.out.println("invalid input");
     }
   }
   else return;
  }

  }


}