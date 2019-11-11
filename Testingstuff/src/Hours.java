public class Hours
{
  private int startWork;
  private int endWork;

  public Hours(int startWork,int endWork,Date date){
    this.startWork=startWork;
    this.endWork=endWork;

  }

  public int getStartWork()
  {
    return startWork;
  }

  public void setStartWork(int startWork)
  {
    this.startWork = startWork;
  }

  public int getEndWork()
  {
    return endWork;
  }

  public void setEndWork(int endWork)
  {
    this.endWork = endWork;
  }

}
