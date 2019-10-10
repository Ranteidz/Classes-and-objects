public class BedTest
{
  public static void main(String[] args)
  {
    Bed bed1 = new Bed("double");
    Bed bed2 = new Bed("king size");
    Bed bed3 = new Bed("SinGlE");

    System.out.println(bed1.isDouble());
    System.out.println(bed1.isKingSize());
    System.out.println(bed1.isSingle());




  }
}
