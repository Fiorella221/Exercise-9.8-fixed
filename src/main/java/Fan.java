public class Fan {
  
  // Constants for fan speeds
  public static final int SLOW = 1;
  public static final int MEDIUM = 2;
  public static final int FAST = 3;
 
  // Fan attributes
  private int speed;
  private boolean on;
  private double radius;
  private String color;
  
  // Default constructor
  public Fan() {
    this.speed = SLOW;
    this.on = false;
    this.radius = 5;
    this.color = "blue";
  }
  
  // Getter and setter methods for speed, on, radius, and color
 
  public int getSpeed() {
    return this.speed;
  }
  
  public void setSpeed(int speed) {
    // Check if speed is valid
    if (speed == SLOW || speed == MEDIUM || speed == FAST) {
      this.speed = speed;
    } else {
      throw new IllegalArgumentException("Speed must be SLOW, MEDIUM, or FAST");
    }
  }
  
  public boolean isOn() {
    return this.on;
  }
  
  public void setOn(boolean on) {
    this.on = on;
  }
  
  public double getRadius() {
    return this.radius;
  }
  
  public void setRadius(double radius) {
    // Check if radius is valid
    if (radius > 0) {
      this.radius = radius;
    } else {
       throw new IllegalArgumentException("Radius must be positive");
    }
  }
  
  public String getColor() {
    return this.color;
  }
  
  public void setColor(String color) {
    this.color = color;
  }
  
  // Overriden toString method to return a string representation of the fan
  @Override
  public String toString() {
    if (on) {
      return "Fan is ON\n" + "Speed: " + speed + "\nColor: " + color + "\nRadius: " + radius;
    } else { 
      return "Fan is OFF\n" + "Color: " + color + "\nRadius: " + radius;
    }
  }
    // Main method to test the Fan class
    public static void main(String[] args) {
       // Create two fan obejcts and their attributes 
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        // Print the attributes of the two fan objects
        System.out.println(fan1);
        System.out.println(fan2);
    }
  }


     
      
   
  
  
  
  
  