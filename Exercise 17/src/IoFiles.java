import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
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
    StudentList students = new StudentList();
    Student student1 = new Student("Bob", 222222, "LT", 2,
        new MyDate(12, 12, 2000));
    Student student2 = new Student("Cob", 222222, "LT", 2,
        new MyDate(12, 12, 2000));
    Student student3 = new Student("Dob", 222222, "LT", 2,
        new MyDate(12, 12, 2000));
    Student student4 = new Student("Mob", 222222, "LT", 2,
        new MyDate(12, 12, 2000));
    students.add(student1);
    students.add(student2);
    students.add(student3);
    students.add(student4);

    String fileName = "test.bin";
    ObjectOutputStream out = null;
    try
    {
      File file = new File(fileName);
      FileOutputStream fos = new FileOutputStream(file);
      out = new ObjectOutputStream(fos);

    out.writeObject(students);

    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    finally
    {
      try
      {
        out.close();
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
    }

    ObjectInputStream in = null;
    try
    {
      File file = new File(fileName);
      FileInputStream fis = new FileInputStream(file);
      in = new ObjectInputStream(fis);
StudentList data = (StudentList) in.readObject();
      System.out.println(data);
    }
    catch (IOException | ClassNotFoundException e)
    {
      e.printStackTrace();
    }
  }
}
