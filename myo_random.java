class Testing {
  public static void main(String [] args) {
    // place your code here!
    String name = "Aliya";
    System.out.println("Hello " + name);
    // your code ends here!
  }
}
class Testing {
  public static void main(String [] args) {
    // place your code here!
    System.out.println("The number of keys on a keyboard is");
    System.out.print(102);
    System.out.println();
    System.out.println("The value of PI is: ");
    System.out.print(3.14);
    System.out.println();






    
import java.lang.Math;
import java.util.Scanner;
 

class Assignment1 { // you always need this, call it whatever class you want.

                // however, the name of the class should be the same as the 

                // filename (in this case, myClass.java)
    
    public static void main(String [] args) {
 
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for length and width
        System.out.printf("Calculate the area of the rectange.");    
        System.out.print(" Enter the length of the rectangle to calculate the area: ");
        double length = scanner.nextInt();

        System.out.print("Enter the width of the rectangle to calculate the area: ");
        double width = scanner.nextDouble();

        // Calculate the area of the rectangle
        double area = length * width;

        // Display the result of the area rectangle 
        System.out.printf("The area of the rectangle is: %.2f%n", area);

        
        System.out.print("Enter the radius of the circle to calculate the area: ");
        double radius = scanner.nextDouble();
        
        //Calculate the area of the circle
        
        double circle = Math.PI * radius * radius;
         System.out.printf("Calculate the area of the circle.");  
         System.out.print("Area of the circle is: "+circle);
        
        // the surface area and volume of a cylinder 
         System.out.print("Enter the raduis for the cylinder: ");
         double radius1 = scanner.nextDouble();
         
        //the height of the cylinder 
         System.out.print("Enter the height for the cylinder: ");
         double height = scanner.nextDouble();
         
        //calculate the surface area and volume of a cylinder
         double volume = Math.PI * Math.pow (radius1,2)*height;
         double surfaceArea = 2 * Math.PI *  radius1 *(radius1 + height);
          
        // Display the results
         System.out.printf("Volume of the cylinder: %.2f\n", volume);
         System.out.printf("Surface area of the cylinder: %.2f\n", surfaceArea);
         
         //Calculate the period 
         double GRAVITY = 9.8; // acceleration due to gravity
         
         // get hyte lenght from the user 
         System.out.print("Enter the lenght of the pendulum(in  meters): ");
         double lenght1 = scanner.nextDouble();
         
         // Calculate the period of the pendulum
         double period = 2 * Math.PI * Math.sqrt(length / GRAVITY); 
         
         //display result 
         System.out.printf("The period of the pendulum is: %.2f seconds\n", period);
         

         

        // Close the scanner
        scanner.close();
    }
}


    
    // your code ends here!
  }
}
