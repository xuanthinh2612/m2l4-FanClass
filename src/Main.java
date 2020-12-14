public class Main {
    public static void main(String[] args) {
        FanClass fan1 = new FanClass();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());
        FanClass fan2 = new FanClass();
        fan1.setSpeed(fan1.MEDIUM);
        fan1.setRadius(5);
        fan1.setColor("Blue");
        fan1.setOn(false);
        System.out.println(fan2.toString());

    }
}
