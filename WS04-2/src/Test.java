import java.util.ArrayList;

public class Test
{
  public static void main(String[] args)
  {
    ArrayList<Toy> array1= new ArrayList<Toy>();

    Toy toy1= new Lego(12,24);
    Toy toy2 = new FootBall(12,21);
    Toy toy3 = new Handball(10,30);

    array1.add(toy1);
    array1.add(toy2);
    array1.add(toy3);

    for (Toy toys: array1
         )
    {
      System.out.println(toys.play());
    }

  }


}
