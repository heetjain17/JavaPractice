import java.util.ArrayList;
import java.util.Scanner;

public class Sorting {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    for (int i = 0; i < 5; i++) {
      System.out.println("Enter element no "+i+1+": ");
      int num = sc.nextInt();
      numbers.add(num);
    }

    numbers.sort(null);
    numbers.toArray();
    for (Integer integer : numbers) {
      System.out.println(integer);
    }

  }
}
