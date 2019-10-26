public class TheatreTest
{
  public static void main(String[] args)
  {
    Movie movie1 = new Movie("blabla",200);
    Movie movie2 = new Movie("blablazzzzzzzz",200);
    Movie movie3 = new Movie("blablaxxxxxxxx",200);
    Movie movie4 = new Movie("blablaasaa",8);
    Movie movie5 = new Movie("blasaabla",2000000);

    Theatre theatre1 = new Theatre(5);
    theatre1.addMovie(movie1);
    theatre1.addMovie(movie2);
    theatre1.addMovie(movie3);
    theatre1.addMovie(movie4);
    theatre1.addMovie(movie5);

    System.out.println(theatre1);

    theatre1.removeMovie(movie5);
    System.out.println();
    System.out.println(theatre1);
  }

}
