/*
--------------------------------------------------------------------------------
Question 7: Parallel Table Generator
--------------------------------------------------------------------------------
Create a Java program using 3 threads to print multiplication tables of:
→ 2
→ 3
→ 4

Each table is printed in parallel using a separate thread.
Use the Runnable interface.
*/

public class Tables {
  public static void main(String[] args) {
    Runnable t3 = new Generator(3);
    Runnable t2 = new Generator(2);
    Runnable t4 = new Generator(4);

    Thread th1 = new Thread(t2);
    Thread th2 = new Thread(t3);
    Thread th3 = new Thread(t4);


    th1.start();
    th2.start();
    th3.start();

    try {
      th1.join();
      th2.join();
      th3.join();
    } catch (Exception e) {
      // TODO: handle exception
    }
  }
}

class Generator implements Runnable{
  int num;
  Generator(int num){
    this.num = num;
  }
  @Override
  public void run() {
    for (int i = 1; i < 11; i++) {
      System.out.println(num+" * "+i+" = "+num*i);
    }
  }
}