// Demonstrate constructor overloading by calculating 
// the volume of a sphere and hemisphere.
public class Volume {
  int radius;
  boolean isHemisphere;
  Volume(int radius){
    this.radius = radius;
  }
  Volume(int radius, boolean isHemisphere){
    this.radius = radius;
    this.isHemisphere = isHemisphere;
  }

  double calculate(){
    double volume = (4/3)*Math.PI*Math.pow(radius, 3);
    if(isHemisphere){
      volume /= 2;
    }
    return volume;
  }
  public static void main(String[] args) {
    Volume sphere = new Volume(5);
    System.out.println("Sphere: "+sphere.calculate());
    Volume hemisphere = new Volume(5, true);
    System.out.println("Hemisphere: "+hemisphere.calculate());
  }
}