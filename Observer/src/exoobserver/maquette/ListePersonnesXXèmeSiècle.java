package exoobserver.maquette;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.List;
import java.util.Observable;
import java.util.Observer;


public class ListePersonnesXX�meSi�cle extends Frame implements Observer
{
Label �tiquette;
List liste;
private static final int ann�eD�but = 1901;
private static final int ann�eFin = 2000;


public ListePersonnesXX�meSi�cle(String titre) throws HeadlessException
{
super(titre);
this.�tiquette = new Label("Personnes n�es entre " + ann�eD�but + " et " + ann�eFin);
this.add(this.�tiquette,BorderLayout.NORTH);
this.liste = new List();
this.add(this.liste,BorderLayout.CENTER);

outilsvues.Outils.place(this, 0.6, 0.1, 0.15, 0.15);
}


    @Override
    public void update(Observable o, Object arg) {
        Personne p = (Personne)arg;
        if(p.getAnn�eNaissance() < ann�eFin && p.getAnn�eNaissance() >= ann�eD�but){
            this.liste.add(p.toString());
        }
    }
}
