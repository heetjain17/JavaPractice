/*
--------------------------------------------------------------------------------
Question 1: Alternating Number Printer
--------------------------------------------------------------------------------
Write a Java program using two threads:
→ Thread-1 prints numbers from 1 to 5
→ Thread-2 prints numbers from 6 to 10
→ Output should alternate: 1 6 2 7 3 8 4 9 5 10

Use synchronization and proper coordination to alternate printing.
*/

public class Alternate {
  public static void main(String[] args) {
    Alternator alt = new Alternator();
    Thread t1 = new Thread(() -> {
      for (int i = 1; i < 6; i++) {
        alt.printFromThread1(i);
      }
    });
    Thread t2 = new Thread(() -> {
      for (int i = 6; i < 11; i++) {
        alt.printFromThread2(i);
      }
    });

    t1.start();
    t2.start();
  }
}

class Alternator{
  private boolean thread1Turn = true;

  public synchronized void printFromThread1(int num){
    try {
      while(!thread1Turn){
        wait();
      }
      System.out.println(num+ " ");
      thread1Turn = false;
      notify();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public synchronized void printFromThread2(int num){
    try {
      while(thread1Turn){
        wait();
      }
      System.out.println(num+ " ");
      thread1Turn = true;
      notify();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}