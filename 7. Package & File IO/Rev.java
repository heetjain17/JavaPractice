// Create a user-defined package Palindrome with a method isPalindrome(String s). 
// Import and use it in another class.

import palindrome.Palindrome;

public class Rev {
  public static void main(String[] args) {
    Palindrome p = new Palindrome();
    p.isPalindrome("redrum");
    p.isPalindrome("rever");
  }
}
