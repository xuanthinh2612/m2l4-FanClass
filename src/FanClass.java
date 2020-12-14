public class FanClass {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    int speed = this.SLOW;
    boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    FanClass(){

    }
    public String toString() {
        String st;
        if (this.on){
            st = "Speed: " + getSpeed() + "\nColor: " + getColor() + "\nRadius: " + getRadius() + "\nFan is on";
        } else {
            st = "\nColor: " + getColor() + "\nRadius: " + getRadius() + "\nFan is off";
        }
        return st;

    }
}
