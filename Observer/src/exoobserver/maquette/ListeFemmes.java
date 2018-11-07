package exoobserver.maquette;

import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

public class ListeFemmes extends Observable implements Observer {
    private Vector<Femme> liste;

    /**
     * @param liste
     */
    public ListeFemmes() {
        this.liste = new Vector<Femme>();
    }

    public boolean add(Femme femme) {
        this.setChanged();
        this.notifyObservers(femme);
        return this.liste.add(femme);
    }

    @Override
    public String toString() {
        return new Outils<Femme>().toString(liste, "(\n", "\n", ")");
    }

    @Override
    public void update(Observable o, Object arg) {
        Personne p = (Personne)arg;

        if(p.getSexe().equals("féminin")){
            Femme f = (Femme)p;
            this.liste.add(f);
        }
    }
}
