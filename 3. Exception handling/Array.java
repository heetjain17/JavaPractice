// Read an array of size 5 and handle 
// ArrayIndexOutOfBoundsException using try-catch-finally.

import java.util.Scanner;

public class Array {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numbers = new int[5];
    try {
      while (true) {
        for (int i = 0; i <= 5; i++) {
          System.out.println("Enter element number "+(i+1)+" :");
          numbers[i] = sc.nextInt();
        }
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Tried to access array index beyond its size");
    } finally{
        System.out.println("Array created: ");
      for (int i = 0; i < numbers.length; i++) {
        System.out.println("Element "+(i+1)+": "+numbers[i]);
      }
      sc.close();
    }
  }
}
