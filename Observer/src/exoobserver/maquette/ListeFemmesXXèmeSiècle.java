package exoobserver.maquette;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Observable;
import java.util.Observer;


public class ListeFemmesXXèmeSiècle implements Observer {
    private static final int annéeDébut = 1900;
    private static final int annéeFin = 2000;

    PrintStream liste;

    public ListeFemmesXXèmeSiècle(File file) throws FileNotFoundException {
        this.liste = new PrintStream(file);
        this.liste.println("Femmes nées entre " + annéeDébut + " et " + annéeFin + " :");
        this.liste.println("\n");
    }


    @Override
    public void update(Observable o, Object arg) {
        Personne p = (Personne)arg;
        if(p.getSexe().equals("féminin") && p.getAnnéeNaissance() < annéeFin && p.getAnnéeNaissance() >= annéeDébut){
            Femme f = (Femme)p;
            this.liste.println(f);
        }
    }

}
