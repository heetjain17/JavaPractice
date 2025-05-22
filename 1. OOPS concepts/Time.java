// Create a Time class with hh, mm, ss as fields. 
// Write a method add(Time t1, Time t2) 
// to return the sum of two time objects in hh:mm:ss format.
// (Covers: Classes, Objects, Method Implementation)
public class Time {
  int hours, minutes, seconds;
  Time(int hours, int minutes, int seconds){
    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;
  }
  
  public static String add(Time t1, Time t2) {
    int tsecs = t1.seconds + t2.seconds;
    int tmins = t1.minutes + t2.minutes;
    int thours = t1.hours + t2.hours;
    if(tsecs >= 60){
      tsecs -= 60;
      tmins++;
    }
    if(tmins >= 60){
      tmins -= 60;
      thours++;
    }

    return thours+":"+tmins+":"+tsecs;
  }
  public static void main(String[] args) {
    Time t1 = new Time(3, 40, 50);
    Time t2 = new Time(3, 40, 50);

    System.out.println(Time.add(t1, t2));
  }
}