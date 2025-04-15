package trafficlight;

public class TrafficLight {

    protected final TrafficLightState red = new RedState(this);
    protected final TrafficLightState green = new GreenState(this);
    protected final TrafficLightState off = new OffState(this);
    protected TrafficLightState current = off;

    public String getColor() {
        return current.getColor();
    }

    public void nextColor() {

        current.nextColor();
    }

    public void switchOn() {
        current.switchOn();
    }

    public void switchOff() {
        current.switchOff();
    }
}
