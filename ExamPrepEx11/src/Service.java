public class Service
{

  private int mileage;
  private Date date;

  public Service(int mileage,Date date)
  {
    this.mileage=mileage;
    date= new Date().copy();
  }
  public int getMileage(){
    return mileage;
  }
  public Date getDate()
  {
    return new Date().copy();
  }
  public boolean equals(Object obj){
    if(!(obj instanceof Service)){
      return false;
    }
    Service other = (Service) obj;
    return mileage==other.mileage && date.equals(other.date);
  }
  public String toString(){
    return mileage +" " +getDate();
  }

}
