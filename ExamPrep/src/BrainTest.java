public class BrainTest
{
  public static void main(String[] args)
  {
    Brain brain1 = new Brain();
    System.out.println(brain1.isBrainDamaged());
    System.out.println(brain1.getIq());
    System.out.println(brain1.toString());
    brain1.remember("Lalalalalalalalalalala");
    brain1.remember("asasas");
    brain1.remember("asdjasoidhas");
    brain1.remember("active?");
    System.out.println(brain1.toString());
    brain1.remember("active again");
    System.out.println(brain1.toString());
    brain1.refreshMemory("active?");
    System.out.println(brain1.toString());
    brain1.refreshMemory("active?");
    System.out.println(brain1.toString());
    System.out.println(brain1.recall("active?"));
    System.out.println(brain1.recall());
  }
}
