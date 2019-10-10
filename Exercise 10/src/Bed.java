public class Bed
{
  private String type;

  public Bed(String type)
  {
    this.type=type;
  }
  public boolean isSingle()
  {

    return type.equalsIgnoreCase("single");
  }
public boolean isDouble(){
    return type.equalsIgnoreCase("double");
}
public boolean isKingSize(){
    return type.equalsIgnoreCase("kingsize") || type.equalsIgnoreCase("king size");
}
}
