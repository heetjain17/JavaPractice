public class Garbage {
  int id;
  Garbage(int id){
    this.id = id;
    System.out.println("Obj "+id+" created");
  }
  @Override
  protected void finalize() throws Throwable{
    System.out.println("Obj "+id+" is being collected");
    super.finalize(); // deprecated ahh method
  }
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      new Garbage(1);
    }

    System.gc();

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
