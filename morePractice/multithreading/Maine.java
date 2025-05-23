/*
--------------------------------------------------------------------------------
Question 2: Uppercase and Lowercase Printer
--------------------------------------------------------------------------------
Create two threads using the Runnable interface:
→ One thread prints uppercase letters A to Z
→ The other thread prints lowercase letters a to z

Each thread should print characters in sequence.
*/

import java.net.Inet4Address;

public class Maine {
  public static void main(String[] args) {
    Runnable up = new UpperCase();
    Runnable low = new LowerCase();

    Thread t1 = new Thread(up);
    Thread t2 = new Thread(low);

    t1.start();
    try {
      t1.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    t2.start();
  }
}

class LowerCase implements Runnable{
  @Override
  public void run() {
    for (char i = 'a'; i <= 'z'; i++) {
      System.out.print(i+" ");
    }
  }
}

class UpperCase implements Runnable{
  @Override
  public void run() {
    for (char i = 'A'; i <= 'Z'; i++) {
      System.out.print(i+" ");
    }
  }
}
