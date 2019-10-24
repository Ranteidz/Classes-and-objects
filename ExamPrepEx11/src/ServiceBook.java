import java.util.ArrayList;

public class ServiceBook
{
  private ArrayList<Service> services;

  public ServiceBook()
  {
    services = new ArrayList<Service>();
  }

  public void addService(Service service)
  {
    services.add(service);
  }

  public void removeService(Service service)
  {
    services.remove(service);

  }

  public int getNumberOfServices()
  {
    return services.size();
  }

  public Service getService(int index)
  {

    return services.get(index-1);
  }
  public ArrayList<Service> getAllServices(){
    return services;
  }
 /* public int getAllServiceMileages(){
    return
  }*/

}


