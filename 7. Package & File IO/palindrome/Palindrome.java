package palindrome;

public class Palindrome {
  public void isPalindrome(String string){
    StringBuilder og = new StringBuilder(string);
    StringBuilder rev = new StringBuilder(string).reverse();

    System.out.println("The original string is "+og);
    System.out.println("The reverse string is "+rev);
    if(og.toString().equals(rev.toString())){
      System.out.println("The string is palindrome");
    }else{
      System.out.println("The string is not palindrome");
    }
  } 
}
