// Create a custom exception InvalidAgeException 
// and throw it if age < 18. 
// Handle it using try-catch.

import java.util.Scanner;

public class Age {
  public static void main(String[] args) {
    try {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the age: ");
      int age = sc.nextInt();
      sc.close();

      if(age < 18){
        throw new InvalidAgeException("Under age");
      }

    } catch (InvalidAgeException e) {
      System.out.println(e);
    }
  }
}
class InvalidAgeException extends Exception{
  InvalidAgeException(String message){
    super(message);
  }
}