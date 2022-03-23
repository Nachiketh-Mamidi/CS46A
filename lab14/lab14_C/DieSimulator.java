/**
   This program simulates casting a die ten times.
*/
public class DieSimulator
{
   public static void main(String[] args)
   {
      Die d = new Die(6);
      final int TRIES = 10;
      String n = d.cast();
      System.out.println(n);
   }
}