public class FootBall extends Ball
{
public FootBall(int suitableAge,int diameter){
  super(suitableAge,diameter);
}

  @Override public String play()
  {
    return "Kick";
  }

  @Override public String toString()
  {
    return getSuitableAge() +" "+ getDiameter();
  }
public boolean equals(Object obj)
{
  if(!(obj instanceof FootBall)){
    return false;
  }
  FootBall other = (FootBall) obj;
  return super.equals(other);
}
}
