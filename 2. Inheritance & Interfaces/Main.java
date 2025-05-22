// Create a class C that implements 
// two interfaces A and B to achieve multiple inheritance.

public class Main {

  public static void main(String[] args) {
    C cee = new C();
    cee.Amethod();
    cee.Bmethod();
  }
}

interface A {
  void Amethod();
}

interface B {
  void Bmethod();
}

class C implements A, B{
  @Override
  public void Amethod() {
    System.out.println("Interface A implemented successfully");
  }
  @Override
  public void Bmethod() {
    System.out.println("Interface B implemented successfully");
  }
}