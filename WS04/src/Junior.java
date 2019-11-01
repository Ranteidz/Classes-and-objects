public class Junior extends ClubMember
{

  private char gender;
  public Junior(String name,int age,char gender)
  {
    super(name,age);
    this.gender=gender;
  }

  public char getGender(){
    return gender;
  }
  public String toString(){
    return super.toString() + " "+ gender;
  }

  @Override public double getMembershipFee()
  {
    if(gender=='M' || gender=='m'){
      return 400;
    }
    if(gender =='F' || gender == 'f'){
      return 300;
    }
    else return -1;
  }

}
