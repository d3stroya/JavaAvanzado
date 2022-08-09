public class Lightbulb {
    boolean poweredOn = false;
    int voltaje = 0;

    public void turnOn(int voltaje) {
        poweredOn = true;
        this.voltaje = voltaje;
        System.out.println("Lightbulb powered on with " + voltaje + "V");
    }

    public void turnOff() {
        poweredOn = false;
        voltaje = 0;
        System.out.println("Lightbulb powered off");
    }

    public boolean isPoweredOn() {
        return poweredOn;
    }
}
