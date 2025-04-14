package trafficlight;

public class TrafficLight {

    protected final TrafficLightState red = new RedState(this);
    protected final TrafficLightState green = new GreenState(this);
    protected TrafficLightState current = red;

    public String getColor() {
        return current.getColor();
    }

    public void nextColor() {
        current.nextColor();
    }
}
