package tiere;

import event.PropertyChangedEvent;
import event.PropertyChangedListener;


import java.util.ArrayList;
import java.util.List;

public class Schwein {

    private List<PigTooFatListener> pigTooFatListeners = new ArrayList<>();
    private List<PropertyChangedListener> propertyChangedListeners = new ArrayList<>();
    public void addPigTooFatListener(PigTooFatListener listener){
        pigTooFatListeners.add(listener);
    }
    public void removePigTooFatListener(PigTooFatListener listener){
        pigTooFatListeners.remove(listener);
    }

    public void addPropertyChangedListeners(PropertyChangedListener listener){
        propertyChangedListeners.add(listener);
    }
    public void removePropertyChangedListener(PropertyChangedListener listener){
        propertyChangedListeners.remove(listener);
    }

    private void firePigTooFatEvent() {
        pigTooFatListeners.forEach(listener->listener.pigTooFat(this));
    }

    private void firePropertyChangedEvent(String propertyName, Object oldValue, Object newValue) {
        firePropertyChangedEvent(new PropertyChangedEvent(this, propertyName, oldValue, newValue));
    }

    private void firePropertyChangedEvent(PropertyChangedEvent event) {
        propertyChangedListeners.forEach(listener->listener.propertyChanged(event));
    }


    private String name;
    private int gewicht;

    public Schwein() {
        this("nobody");
    }

    public Schwein(final String name) {
        this.name = name;
        this.gewicht = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {

        if(name.equals(this.name)) return;

        firePropertyChangedEvent("name", this.name, this.name = name);

    }

    public int getGewicht() {
        return gewicht;
    }

    private void setGewicht(final int gewicht) {
        if(gewicht == this.gewicht) return;
        PropertyChangedEvent event = new PropertyChangedEvent(this, "gewicht",this.gewicht, gewicht);
        this.gewicht = gewicht;
        firePropertyChangedEvent(event);
        if(gewicht > 20) firePigTooFatEvent();
    }

    public void fuettern() {
        setGewicht(getGewicht() + 1);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Schwein{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gewicht=").append(gewicht);
        sb.append('}');
        return sb.toString();
    }
}
