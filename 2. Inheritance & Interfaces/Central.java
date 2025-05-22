// Implement hierarchical inheritance with a base class Shape 
// and subclasses Circle/Rectangle. 
// Use an interface Drawable with a draw() method.

interface Drawable {
  void draw();
}

abstract class Shape  implements Drawable{
  String color, type;
  Shape(String color, String type){
    this.color = color;
    this.type = type;
  }
  @Override
  public void draw() {
    System.out.println("Drawing "+type+" of color "+color);
  }
}

class Circle extends Shape{
  Circle(String color){
    super(color, "Circle");
  }
}

class Rectangle extends Shape{
  Rectangle(String color){
    super(color, "Rectangle");
  }
}

public class Central {
  public static void main(String[] args) {
    Circle c = new Circle("Pink");
    Rectangle r = new Rectangle("Magenta");

    c.draw();
    r.draw();
  }
}
