public class Testing
{
  public static void main(String[] args)
  {
    Date date1 = new Date(12,12,12);
    Service service1 = new Service(1000,date1);
    Service service2 = new Service(1001130,date1);
    Service service3 = new Service(1006660,date1);
    Service service4 = new Service(100220,date1);

    ServiceBook book1= new ServiceBook();
    book1.addService(service1);
    book1.addService(service2);
    book1.addService(service3);
    book1.addService(service4);
    System.out.println(book1.getAllServices());
    System.out.println(book1.getNumberOfServices());
    System.out.println(book1.getService(2));
    date1.set(12,12,12);
    System.out.println(book1.getAllServices());
    System.out.println(service1.getDate());
    System.out.println(service1.getMileage());
    System.out.println(date1);
  }
}
