import java.util.ArrayList;

public class Test
{

  public static void main(String[] args)
  {
    ArrayList<ClubMember> array1 = new ArrayList<ClubMember>();

    ClubMember member1 = new Junior("Bob",12,'m');
    ClubMember member2 = new Junior("Shanon",12,'F');
    ClubMember member3 = new Senior("Peter",50,'D');
    ClubMember member4 = new OldBoys("Mike", 50,4);

    array1.add(member1);
    array1.add(member2);
    array1.add(member3);
    array1.add(member4);



    for (ClubMember member: array1)
    {
      System.out.println(member.getMembershipFee());
    }


  }
}
