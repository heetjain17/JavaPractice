/*
--------------------------------------------------------------------------------
Question 5: Thread Priority Demonstration
--------------------------------------------------------------------------------
Create three threads:
→ One prints "Low Priority"
→ One prints "Medium Priority"
→ One prints "High Priority"

Assign priorities using setPriority() and observe the output pattern.
*/

public class priority {
  public static void main(String[] args) {
    High h = new High();
    Medium m = new Medium();
    Low l = new Low(); 

    h.setPriority(Thread.MAX_PRIORITY);
    l.setPriority(Thread.MIN_PRIORITY);

    h.start();
    m.start();
    l.start();
  }
}
class High extends Thread{
  @Override
  public void run() {
    System.out.println("High Priority");
  }
}
class Medium extends Thread{
  @Override
  public void run() {
    System.out.println("Medium Priority");
  }
}
class Low extends Thread{
  @Override
  public void run() {
    System.out.println("Low Priority -_-");
  }
}