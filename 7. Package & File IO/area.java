// Read length and breadth from the command line and 
// calculate the area of a rectangle.

public class area {
  public static void main(String[] args) {
    if(args.length != 2){
      System.out.println("Enter length & breadth");
      return;
    }

    double length = Double.parseDouble(args[0]);
    double breadth = Double.parseDouble(args[1]);

    double area = length*breadth;

    System.out.println("The area is "+area);
  }
}