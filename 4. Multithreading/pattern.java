// Print a pattern like */*/*/* using two threads 
public class pattern {
  public static void main(String[] args) {
    Object lock = new Object();

    StarThread star = new StarThread(lock);
    SlashThread slash = new SlashThread(lock);

    slash.start();
    star.start();

  }
}

class StarThread extends Thread{
  Object lock;
  StarThread(Object lock){
    this.lock = lock;
  }

  @Override
  public void run() {
    for (int i = 0; i < 4; i++) {
      System.out.print("*");
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      if(i<3){
        synchronized(lock){
          lock.notify();
          try {
            lock.wait();
          } catch (Exception e) {
            System.out.println(e);
          }
        }
      }
    }
  }
}

class SlashThread extends Thread{
  Object lock;
  SlashThread(Object lock){
    this.lock = lock;
  }

  @Override
  public void run() {
    for (int i = 0; i < 3; i++) {
      synchronized(lock){
        try {
          lock.wait();
        } catch (Exception e) {
          System.out.println(e);
        }
        System.out.print("/");
        lock.notify();
      }

    }
  }
}
