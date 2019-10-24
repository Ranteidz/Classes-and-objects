public class Date
{
  private int day;
  private int month;
  private int year;

  public Date(int day, int month, int year){
    this.day=day;
    this.month=month;
    this.year=year;
  }
  public Date(){

  }


  public void set(int day, int month,int year){
    this.day=day;
    this.month=month;
    this.year=year;
  }
  public int numberOfDaysInMonth(){
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
  public Date copy(){
    Date other;
    other = new Date(day, month, year);
    return other;
  }


  public boolean equals(Object obj){
    if(!(obj instanceof Date)){
      return false;
    }
    Date other= (Date) obj;
    return day==other.day && month==other.month && year==other.year;
  }
  public String toString(){
    return day+" "+month+" "+year;
  }

}
