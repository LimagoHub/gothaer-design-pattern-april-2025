package main;

import event.PropertyChangedEvent;
import event.PropertyChangedListener;
import tiere.PigTooFatListener;
import tiere.Schwein;

public class Main implements PropertyChangedListener {
    @Override
    public void propertyChanged(final PropertyChangedEvent event) {
        System.out.println("PropertyChangedEvent: " + event);
    }

    private Metzger metzger = new Metzger();
    private Spediteuer spediteur = new Spediteuer();
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Schwein piggy = new Schwein("Miss Piggy");
        piggy.addPigTooFatListener(new SchweineMetzgerAdapter());
        piggy.addPigTooFatListener(s->spediteur.fahren(s));
        piggy.addPigTooFatListener(spediteur::fahren);
        for (int i = 0; i < 11; i++) {
            piggy.fuettern();
        }
    }

    class SchweineMetzgerAdapter implements PigTooFatListener {

        @Override
        public void pigTooFat(final Schwein schwein) {
            metzger.schlachten(schwein);
        }
    }
}

class Metzger  {


    public void schlachten(final Schwein schwein) {
        System.out.println("Messer wetz!");
    }
}

class Spediteuer {
    public void fahren(Object ware) {
        System.out.println("Wir fahren auf der Autobahn");
    }
}