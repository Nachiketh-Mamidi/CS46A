public class BusRunner
{
   public static void main(String[] args)
   {
      Bus bus = new Bus();           // 1
      bus.drive(3);                  // 2
      bus.turn();                    // 3
      bus.drive(1);                  // 4
      bus.turn();                    // 5
      bus.drive(4);                  // 6
      System.out.println(bus.getCurrentStop());
   }
}
