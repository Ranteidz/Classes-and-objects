public class Movie
{
  private String title;
  private String genre;
  private int duration;

  public Movie(String title, String genre, int duration){
    this.title=title;
    this.genre=genre;
    this.duration=duration;

  }
  public  Movie(String title,  int duration){
    this.title=title;
    this.genre=null;
    this.duration=duration;

  }
  public String getTitle(){
    return title;

  }
  public String getGenre(){
    return genre;
  }
  public void setGenre(String genre)
  {
    this.genre=genre;
  }
public int getDuration(){
    return duration;
}
public boolean equals(Object obj)
{
  if(!(obj instanceof Movie))
  {
    return false;
  }
  Movie other= (Movie) obj;
  return this.title == other.title && this.genre==other.genre && this.duration==other.duration;
}
public String toString(){
    return title+" "+genre+" "+duration;
}

}
