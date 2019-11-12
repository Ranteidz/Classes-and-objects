import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class IoFiles
{

  public static void main(String[] args)
  {
    ////////////////////////////////////////////////////////////
    /*Scanner input = new Scanner(System.in);

    System.out.println("Enter the file name");

    String nameFile = input.nextLine();
    ArrayList<String> names = new ArrayList<>();

    int i = 0;
    while (i != 1)
    {
      System.out.println("Enter friend names : \n Type 'end' to stop");
      String container = input.nextLine();
      if (!(container.equalsIgnoreCase("end")))
      {
        names.add(container);
      }
      if (container.equalsIgnoreCase("end"))
      {
        i++;
      }
    }

    System.out.println(names);

    File file = new File(nameFile);
    PrintWriter out = null;
    try
    {
      out = new PrintWriter(file);
    }
    catch (FileNotFoundException e)
    {
      e.printStackTrace();

    }
    for (String number : names)
    {
      out.println(number);
      out.flush();
    }
    out.close();

    System.out.println("Enter the name of file you would like to see : ");
    String userTextFile = input.nextLine();
    File userFile = new File(userTextFile);
    Scanner in = null;
    try
    {
      in = new Scanner(userFile);
    }
    catch (FileNotFoundException e)
    {
      e.printStackTrace();
    }

    while (in.hasNext())
    {

      String line = in.nextLine();
      String[] token = line.split(";");
      String txt = token[0].trim();
      System.out.println(txt);
    }
    in.close();
*/
    ///////////////////////////////////////////////////////////////////////
    StudentList list =new StudentList();

    File file = new File("Students.txt");
    Scanner read = null;
    try
    {
      read = new Scanner(file);
    }
    catch (FileNotFoundException e)
    {
      e.printStackTrace();
    }

    while(read.hasNext()){

      String line = read.nextLine();
      String[] token = line.split(",");
      int groupNumber = Integer.parseInt(token[0].trim());
      int studyNumber = Integer.parseInt(token[1].trim());
      String studentName = token[2].trim();
      String studentNationality = token[3].trim();
      int dayBirth= Integer.parseInt(token[4].trim());
      int monthBirth= Integer.parseInt(token[5].trim());
      int yearBirth=Integer.parseInt(token[6].trim());
      list.add(new Student(studentName,studyNumber,studentNationality,groupNumber,new MyDate(dayBirth,monthBirth,yearBirth)));


    }
    read.close();
    System.out.println(list);

    Student student = new Student("John",123124,"DK",2,new MyDate(12,12,2000));
    list.add(student);

    System.out.println(list);
  }
}
