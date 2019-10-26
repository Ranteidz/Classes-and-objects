import java.util.ArrayList;

public class SiteColection
{
  private int size;
  private ArrayList<Website> website;

  public SiteColection(int maxSites)
  {
    this.size=maxSites;
    website = new Array[maxSites];
  }
  public Website[] getAllnotUpdatedSites()
  {
    Website[] next = new Website[website.size()];
    int count = 0;
    for(int i=0;i<website.size();i++){
      if(website.get(i).needsUpdate() == true)
      {
        next[count] = website.get(i);
        count++;
      }

    }
    return next;
  }
}
