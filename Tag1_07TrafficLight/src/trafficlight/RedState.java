package trafficlight;

public class RedState extends AbstractTrafficLightColorState {
    public RedState(final TrafficLight trafficLight) {
        super(trafficLight);
    }

    @Override
    public String getColor() {
        return "Red";
    }

    @Override
    public void nextColor() {
        getTrafficLight().current = getTrafficLight().green;
    }
}
