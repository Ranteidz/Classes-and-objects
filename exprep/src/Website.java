public class Website
{

  public boolean equals(Object obj){
    if(!(obj instanceof Website))
    {
      return false;
    }
    Website other = (Website) obj;
    return
  }
  public void markAsNotUpdated()
  {
    this.needsUpdate = false;
  }
}
