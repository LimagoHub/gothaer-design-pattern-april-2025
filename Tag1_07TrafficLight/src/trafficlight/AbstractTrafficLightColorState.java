package trafficlight;

public class AbstractTrafficLightColorState extends AbstractTrafficLightState {
    protected AbstractTrafficLightColorState(final TrafficLight trafficLight) {
        super(trafficLight);
    }

    @Override
    public void switchOff() {
        getTrafficLight().current = getTrafficLight().off;
    }
}
