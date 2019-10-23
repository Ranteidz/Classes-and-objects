public class Brain
{
  private String activeMemoryItem;
  private String passiveMemoryItemOne;
  private String passiveMemoryItemTwo;

  public Brain()
  {
    this.activeMemoryItem = "";
    this.passiveMemoryItemOne = "";
    this.passiveMemoryItemTwo = "";
  }

  public int getIq()
  {
    int active = 0, passiveOne = 0, passiveTwo = 0;
    active = activeMemoryItem.length();
    passiveOne = passiveMemoryItemOne.length();
    passiveTwo = passiveMemoryItemTwo.length();
    if (active > 10 && passiveOne > 10 && passiveTwo > 10)
    {
      if (active > 20 || passiveOne > 20 || passiveTwo > 20)
      {
        return 130;
      }
    }
    if (active > 10 && passiveOne > 10 && passiveTwo > 10)
    {
      return 100;
    }
    else
      return 70;
  }

  public boolean isBrainDamaged()
  {
    if (activeMemoryItem.equals("") || passiveMemoryItemOne.equals("")
        || passiveMemoryItemTwo.equals(""))
    {
      return true;
    }
    else
      return false;
  }

  public void remember(String info)
  {
    String memoryContainer1,memoryContainer2;
    memoryContainer1=passiveMemoryItemOne;
    memoryContainer2=activeMemoryItem;
    passiveMemoryItemTwo=memoryContainer1;
    passiveMemoryItemOne=memoryContainer2;


    this.activeMemoryItem = info;

  }

  public void refreshMemory(String info)
  {
    String memoryContainer1;
    String memoryContainer2;
    if (passiveMemoryItemOne.equals(info))
    {
      memoryContainer1 = passiveMemoryItemOne;
      memoryContainer2 = activeMemoryItem;
      activeMemoryItem = memoryContainer1;
      passiveMemoryItemOne = memoryContainer2;

    }
    if (passiveMemoryItemTwo.equals(info))
    {
      memoryContainer1 = passiveMemoryItemTwo;
      memoryContainer2 = activeMemoryItem;
      activeMemoryItem = memoryContainer1;
      passiveMemoryItemTwo = memoryContainer2;
    }
  }

  public boolean recall(String info)
  {
    if (activeMemoryItem.equals(info) || passiveMemoryItemOne.equals(info)
        || passiveMemoryItemTwo.equals(info))
    {
      return true;
    }
    else
      return false;
  }

  public String recall()
  {
    return activeMemoryItem;
  }

  public String toString()
  {
    return activeMemoryItem + " " + passiveMemoryItemTwo + " "
        + passiveMemoryItemTwo;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Brain))
    {
      return false;
    }
    Brain other = (Brain) obj;
    return activeMemoryItem.equals(other.activeMemoryItem)
        && passiveMemoryItemOne.equals(other.passiveMemoryItemOne)
        && passiveMemoryItemTwo.equals(other.passiveMemoryItemTwo);
  }


}

