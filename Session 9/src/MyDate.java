import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MyDate
{
  private int day;
  private int month;
  private int year;
  // private boolean isLeapYear=true;

  /*public MyDate(int day, int month, int year)
  {
    set(day, month, year);
  }*/

  public MyDate(int dayInput, int monthInput, int yearInput)
  {
    day = dayInput;
    month = monthInput;
    year = yearInput;
    if (month < 1)
    {
      month = 1;
    }
    if (month > 12)
    {
      month = 12;
    }
    if (day < 1)
    {
      day = 1;
    }
    if (day > numberOfdaysMonth(month))
    {
      day = numberOfdaysMonth(month);
    }
  /*  if (month < 1)
    {
      month = 1;
    }
    if (month > 12)*/
    {
      month = 12;
    }
    if (year < 0)
    {
      year = -year;
    }

  }

  public void set(int day, int month, int year)
  {

    this.day = day;
    this.month = month;
    this.year = year;
  }

  public int getDay()
  {
    return day;
  }

  public int getMonth()
  {
    return month;
  }

  public int getYear()
  {
    return year;
  }

  public String toString()
  {
    return day + "/" + ((month < 10) ? ("0" + month) : month) + "/" + year;
  }

  public String getMonthName()
  {
    String[] array1 = {"January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"};
    //array1[getMonth() - 1] = getMonthName();

    return array1[getMonth() - 1];
  }

  public boolean isLeapYear()
  {
    if (year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0)
    {
      return true;
    }
    else
      return false;

  }

  public int numberOfdaysMonth(int month)
  {
    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
        || month == 10 || month == 12)
    {
      return 31;
    }
    else if (month == 4 || month == 6 || month == 9 || month == 11)
    {
      return 30;
    }
    else if (month == 2 && isLeapYear())
    {
      return 29;
    }
    else if (month == 2 && !(isLeapYear()))
    {
      return 28;
    }
    else
      return -1;
  }

  public void StepForwardOneDay()
  {

    day++;
    if (day > numberOfdaysMonth(month))
    {
      day = 1;
      month++;
    }

    if (month > 12)
    {
      month = 1;
      year++;
    }

  }

  public MyDate()
  {
    day = GregorianCalendar.DAY_OF_MONTH;
    month = ((GregorianCalendar.MONTH) + 1);
    year = GregorianCalendar.YEAR;
  }

  public boolean equals(Object obj)
  {
    MyDate other = (MyDate) obj;
    if (!(obj instanceof MyDate))
    {
      return false;
    }

    return true;
  }

  public void stepForward(int days)
  {
    for (int i = 0; i < days; i++)
    {
      StepForwardOneDay();
    }

  }

  public static int convertToMonthNumber(String monthNameInput)
  {

    String[] array2 = {"January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"};

    for (int i = 0; i < array2.length; i++)
    {
      if (array2[i].equalsIgnoreCase(monthNameInput))
      {
        return i + 1;
      }
    }
    return -1;
  }
  public MyDate copy()
  {
    return new MyDate(getDay(),getDay(),getYear());
  }



 /* public boolean isBefore(MyDate other)
  {
    other = new MyDate();
    if(<other)
    {
      return true;
    }
    else return false;

  }*/


/*public MyDate() {

  }*/
  /*  System.out.println("Day = " + c.get(Calendar.DAY_OF_MONTH));

    System.out.println("Month = " + (c.get(Calendar.MONTH) + 1));

    System.out.println("Year = " + c.get(Calendar.YEAR));*/
}




