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
<<<<<<< HEAD
    return
=======
    return getSuitableAge() +" "+ getDiameter();
>>>>>>> 858986cbead84e6ca0f9a21df5c4009bc8cd9a96
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
