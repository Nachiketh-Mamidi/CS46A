/**
 * Create a Picture object with the image sunflowers.jpg
 * Draw the picture
 * Use grow method to reduce its width by 400 and height by 500 on both sides
 * Move the picture to the location (0,0) by translate method
 * Show location and size of picture after every step
 * 
 *
 * @author Nachiketh Mamidi
 * @version Feb 4th, 2021
 */public class SunFlowers
{
   public static void main(String[] args)
   {
       // Create a picture object
       Picture pic = new Picture ("sunflowers.jpg");
       
       // Draw the picture
       pic.draw();
       
       // Location of the picture
       System.out.println("X-coordinate: " + pic.getX());
       System.out.println("Y-coordinate: " + pic.getY());
       
       // Size of the picture
       System.out.println("Width :" + pic.getWidth());
       System.out.println("Height :" + pic.getHeight());
       
       // Reduce the picture's width by 400 and height by 500 on both sides
       pic.grow(-400,-500);
       
       // Location of the picture
       System.out.println("X-coordinate: " + pic.getX());
       System.out.println("Y-coordinate: " + pic.getY());
       
       // Size of the Picture
       System.out.println("Width :" + pic.getWidth());
       System.out.println("Height :" + pic.getHeight());
       
       // Move the picture to (0,0)
       pic.translate(-400,-500);
       
       //Location of the picture
       System.out.println("X-coordinate: " + pic.getX());
       System.out.println("Y-coordinate: " + pic.getY());
       
       // Size of the picture
       System.out.println("Width :" + pic.getWidth());
       System.out.println("Height :" + pic.getHeight());
       

    }
}