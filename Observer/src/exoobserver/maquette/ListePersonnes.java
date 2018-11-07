package exoobserver.maquette;


import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

public class ListePersonnes extends Observable implements Observer {
    private Vector<Personne> liste;

    /**
     * crée une liste vide de personnes
     */
    public ListePersonnes() {
        this.liste = new Vector<Personne>();
    }

    /**
     * insère une nouvelle personne dans la liste
     */
    public boolean add(Personne personne) {
        this.setChanged();
        this.notifyObservers(personne);
        return this.liste.add(personne);
    }

    public String toString() {
        return new Outils<Personne>().toString(this.liste, "(\n", "\n", ")");
    }


    @Override
    public void update(Observable o, Object arg) {
        Personne p = (Personne) arg;
        this.liste.add(p);
    }
}
