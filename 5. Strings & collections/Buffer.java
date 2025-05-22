// Count the frequency of a character in a string 
// using String/StringBuffer.

import java.util.Scanner;

public class Buffer {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter the String: ");
    String s = sc.next();
    System.out.println("Enter the character: ");
    char c = sc.next().charAt(0);

    StringBuffer sb = new StringBuffer(s);
    int count = 0;
    for (int i = 0; i < sb.length(); i++) {
      if (sb.charAt(i) == c) {
        count++;
      }
    }
    System.out.println("Count: "+count);
    sc.close();
  }
}
