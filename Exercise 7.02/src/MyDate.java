import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class MyDate
{
  private int day;
  private int month;
  private int year;


  public MyDate(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
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

  public boolean equals(Object obj)
  {
    if (!(obj instanceof MyDate))
    {
      return false;
    }
    MyDate other = (MyDate) obj;
    return day == other.getDay() && month == other.getMonth() && year == other
        .getYear();
  }

  public MyDate copy()
  {
    MyDate other;
    other = new MyDate(day, month, year);
    return other;
  }
}


