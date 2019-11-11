import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExceptionUserInput
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("enter array size");
    int[] array = new int[input.nextInt()];
    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    for (int i = 0; i < array.length; i++)
    {
      try
      {
        array[i] = input.nextInt();
      }
      catch (Exception e)
      {
        i--;
        System.out.println("testing");
        input.nextLine();
      }
    }
    for (int i = 0; i < array.length; i++)
    {
      arrayList.add(array[i]);
    }
    System.out.println(arrayList);
    int sum = 0;

    int userFirstNumber = 0, userSecondNumber=0;
    System.out.println("Enter the first number from array :");
    while (sum < 2)

    {
      try
      {
        int userInput = input.nextInt();
        if (arrayList.contains(userInput))
        {
          if(sum==0){
            userFirstNumber+=userInput;
          }
          if(sum==1){
            userSecondNumber+=userInput;
          }
          sum++;
          if (sum != 2)
          {
            System.out.println("Enter the 2nd number from array :");
            input.nextLine();
          }
        }
        if(!arrayList.contains(userInput))
        {
          System.out.println("Not the number from the list..");
        }
      }
      catch (Exception e)
      {
        System.out.println("Try again..");
        input.nextLine();
      }

    }
    System.out.println(userFirstNumber +" "+userSecondNumber );
  }

}




