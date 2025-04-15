package pojo;

import java.beans.PropertyChangeSupport;

public class Person {

    PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    private String vorname;
    private String nachname;

    public String getVorname() {
        return vorname;
    }

    public void setVorname(final String vorname) {

        pcs.firePropertyChange("vorname", this.vorname, this.vorname = vorname);
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(final String nachname) {
        this.nachname = nachname;
    }
}
