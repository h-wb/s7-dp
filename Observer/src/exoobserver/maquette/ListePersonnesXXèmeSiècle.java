package exoobserver.maquette;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.List;
import java.util.Observable;
import java.util.Observer;


public class ListePersonnesXXèmeSiècle extends Frame implements Observer
{
Label étiquette;
List liste;
private static final int annéeDébut = 1901;
private static final int annéeFin = 2000;


public ListePersonnesXXèmeSiècle(String titre) throws HeadlessException
{
super(titre);
this.étiquette = new Label("Personnes nées entre " + annéeDébut + " et " + annéeFin);
this.add(this.étiquette,BorderLayout.NORTH);
this.liste = new List();
this.add(this.liste,BorderLayout.CENTER);

outilsvues.Outils.place(this, 0.6, 0.1, 0.15, 0.15);
}


    @Override
    public void update(Observable o, Object arg) {
        Personne p = (Personne)arg;
        if(p.getAnnéeNaissance() < annéeFin && p.getAnnéeNaissance() >= annéeDébut){
            this.liste.add(p.toString());
        }
    }
}
