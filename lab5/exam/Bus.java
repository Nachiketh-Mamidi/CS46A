/**
* Describes a bus going up and down Main Street. It starts at the terminal which is considered stop 0
* and moves along its route. It can reverse direction at any point if told to do so
*/
public class Bus
{
   private int direction;
   private int currentStop;

   /**
    * Constructor for objects of class Bus
    */

   public Bus()
   {
      direction = -1;
      currentStop = 0;
   }
   /**
    * gets the current direction
    * @return 1 if the bus is headed away from the terminal -1 if headed towards the terminal
    */
   public int getDirection()
   {
      return direction;
   }


   /**
    * gets the current stop
    * @return  the stop number where the bus is located
    */
   public int getCurrentStop()
   {
      return currentStop; 
   }


  /**
   * Turns the bus so it will move in the opposite direction
   */

   public void turn()
   {
       direction = direction * -1;
   }

   /**
    * Moves the bus the required number of stops
    * @param numberOfStops number of stops to drive
    */
   public void drive(int numberOfStops)
   {
      currentStop =  numberOfStops;
   }
}