import java.util.ArrayList;

public class Theatre
{

  private int capacity;
  private Movie[] movies;
  private int currentCapacity;

  public Theatre(int capacity)
  {
    this.capacity = capacity;
    movies = new Movie[capacity];
    currentCapacity = 0;
  }

  public void addMovie(Movie movie)
  {

    movies[currentCapacity] = movie;
    currentCapacity++;
  }

  public void addMovie(String title, int duration)
  {

    movies[currentCapacity] = new Movie(title, duration);
    currentCapacity++;
  }

  public int size()
  {
    return movies.length;
  }

  public Movie[] getAllMovies()
  {
    return movies;
   /* Movie[] movies1 = new Movie[movies.length];
    for (int i = 0; i < movies.length; i++)
    {
  movies1[i]=movies[i];
    }
    return movies1;*/
  }

  public Movie[] getAllMoviesOfGenre(String genre)
  {
    Movie[] movies2 = new Movie[movies.length];
    int currentCap = 0;
    for (int i = 0; i < movies.length; i++)
    {
      if (movies[i].getGenre().equals(genre))
      {
        movies2[currentCap] = movies[i];
        currentCap++;
      }
    }
    return movies2;

  }

  public void removeMovie(Movie movie)
  {
    for(int i = 0;i<movies.length;i++)
    {
      if(movies[i].equals(movie))
      {
        for(int n = i+1;n<movies.length;n++)
        {
          movies[n-1]=movies[n];
        }
        movies[movies.length-1]=null;
        currentCapacity--;
        return;
      }
    }
  }
  public String toString(){
    String whatever="";
    for(int i =0;i<currentCapacity;i++){
      whatever+= movies[i] + "\n";
    }
    return whatever;
  }

}
