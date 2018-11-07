package exoobserver.maquette;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Observable;
import java.util.Observer;


public class ListeFemmesXX�meSi�cle implements Observer {
    private static final int ann�eD�but = 1900;
    private static final int ann�eFin = 2000;

    PrintStream liste;

    public ListeFemmesXX�meSi�cle(File file) throws FileNotFoundException {
        this.liste = new PrintStream(file);
        this.liste.println("Femmes n�es entre " + ann�eD�but + " et " + ann�eFin + " :");
        this.liste.println("\n");
    }


    @Override
    public void update(Observable o, Object arg) {
        Personne p = (Personne)arg;
        if(p.getSexe().equals("f�minin") && p.getAnn�eNaissance() < ann�eFin && p.getAnn�eNaissance() >= ann�eD�but){
            Femme f = (Femme)p;
            this.liste.println(f);
        }
    }

}
