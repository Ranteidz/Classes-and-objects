import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Scanner;

public class StudentFile
{
   private File file;

   public StudentFile(String filename)
   {
      setFile(filename);
   }

   public void setFile(String filename)
   {
      file = new File(filename);
   }

   public File getFile()
   {
      return file;
   }

   public void readTextFile() throws FileNotFoundException,
         ParseException
   {
      File file = new File(String.valueOf(getFile()));
      Scanner read = null;

      try
      {
         read = new Scanner(file);
      }
      finally
      {
         while (read.hasNext())
         {
            String line = read.nextLine();
            String[] token = line.split(",");
            int groupNumber = Integer.parseInt(token[0].trim());
            int studyNumber = Integer.parseInt(token[1].trim());
            String studentName = token[2].trim();
            String studentNationality = token[3].trim();
            int dayBirth = Integer.parseInt(token[4].trim());
            int monthBirth = Integer.parseInt(token[5].trim());
            int yearBirth = Integer.parseInt(token[6].trim());
            System.out.println(
                groupNumber + " " + studyNumber + " " + studentName + " "
                    + studentNationality + " " + new MyDate(dayBirth, monthBirth,
                    yearBirth));
         }
         read.close();
      }


   }

   public void  readTextFile(String filename)
         throws FileNotFoundException, ParseException
   {
      setFile(filename);
    readTextFile(filename);
   }

   public void writeTextFile(StudentList students) 
         throws FileNotFoundException
   {
      // TODO: Implement this method

   }

   public void writeTextFile(StudentList students, String filename)
         throws FileNotFoundException
   {
      setFile(filename);
      writeTextFile(students);
   }

   public void writeBinaryFile(StudentList list) throws IOException
   {
      // TODO: Implement this method
   }

   public void writeBinaryFile(StudentList list, String filename)
         throws IOException
   {
      setFile(filename);
      writeBinaryFile(list);
   }

   public StudentList readBinaryFile() throws IOException,
         ClassNotFoundException
   {
      // TODO: Implement this method
      return null;
   }

   public StudentList readBinaryFile(String filename) throws IOException,
         ClassNotFoundException
   {
      setFile(filename);
      return readBinaryFile();
   }

}
