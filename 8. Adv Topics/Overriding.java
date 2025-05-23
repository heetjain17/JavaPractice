// Implement method overriding with a base class Animal
// and subclass Dog overriding sound().

public class Overriding {
  public static void main(String[] args) {
    Dog d1 = new Dog();
    Dog d2 = new Dog();
    d1.sound();
    d2.sound();
  }
}
class Animal {
  void sound(){}
}
class Dog extends Animal {
  @Override
  void sound() {
   System.out.println("Warf Warf !!");
  }
}