// Print odd and even numbers using two threads 
// (one for odds, one for evens) via Runnable.
public class OddEven {
  public static void main(String[] args) {
    Runnable o = new Odd();
    Runnable e = new Even();

    Thread t1 = new Thread(o);
    Thread t2 = new Thread(e);

    t1.start();
    t2.start();
  }
}

class Odd implements Runnable{
  public void run(){
    for (int i = 1; i <= 100; i++) {
      if(i%2 != 0){
        System.out.println(i);
      }
    }
  }
}

class Even implements Runnable{
  public void run(){
    for (int i = 1; i <= 100; i++) {
      if(i%2 == 0){
        System.out.println(i);
      }
    }
  }
}