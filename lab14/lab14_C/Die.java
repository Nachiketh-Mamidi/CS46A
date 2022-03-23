import java.util.Random;

/**
   This class models a die that, when cast, lands on a random
   face.
*/
public class Die
{
   private int sides;
    MyRandom random;
    
   /**
      Constructs a die with a given number of sides.
      @param s the number of sides, e.g. 6 for a normal die
   */
   public Die(int s)
   {
      sides = s;
      random = new MyRandom(s);
   }

   /**
      Simulates a throw of the die
      @return the face of the die 
   */
   public String cast()
   {
      return random.randomInt(1, sides);
   }
}