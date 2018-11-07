package exoobserver.maquette;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * gestion de 4 sortes de listes
 * 
 * 
 * */
public class TestListesPersonnes
{

/**
 * Pour extraire le 1er caract�re de la derni�re ligne tap�e sur le clavier
 * 
 * */
public static char lit1erCaract�re(BufferedReader b) throws IOException
{
return b.readLine().trim().toLowerCase().charAt(0);
}

public static void main(String[] args) 
{
try
    {
    BufferedReader clavier = new BufferedReader(new InputStreamReader(System.in));  // pour lire des cha�nes de caract�res sur le clavier
    
    //---------------- cr�ation du fichier texte repr�sentant la liste des femmes du XX�me si�cle ----------------------
    
    File ici = new File("");        // repr�sente l'emplacement de la racine du projet, c-�-d de l� o� est lanc�e la JVM 
    
    String chemin = "petite_annexe";
    
    File petiteAnnexe = new File(ici.getAbsoluteFile(),chemin);
    
    petiteAnnexe.mkdir();       // cr�ation (s'il n'existe pas d�j�) du sous-r�pertoire "petite_annexe" � partir de la racine du projet
    
    String cheminLocal = chemin+File.separatorChar+"listeFemmesXXemeSiecle.txt";     // cr�ation du chemin "petite_annexe/listeFemmesXXemeSiecle.txt"
    
    File f = new File(ici.getAbsoluteFile(), cheminLocal);      // repr�sente le fichier texte "listeFemmesXXemeSiecle.txt" sur 
                                                                // le sous-r�pertoire "petite_annexe" du r�pertoire racine
    
    //-------------- cr�ation des 4 listes de personnes -----------------------------------
    
    ListePersonnes listePersonnes;
    ListeFemmes listeFemmes;
    ListePersonnesXX�meSi�cle listePersonnesXX�meSi�cle;
    ListeFemmesXX�meSi�cle listeFemmesXX�meSi�cle;
    
    listePersonnes = new ListePersonnes();
    listeFemmes = new ListeFemmes();
    listePersonnesXX�meSi�cle = new ListePersonnesXX�meSi�cle("liste des personnes du XX�me Si�cle"); // personnes n�es au XX�me si�cle
    listePersonnesXX�meSi�cle.setVisible(true);
    listeFemmesXX�meSi�cle = new ListeFemmesXX�meSi�cle(f); // femmes n�es au XX�me si�cle
    
    // ----------------- ici : ins�rer les instructions appropri�es -----------------------
    
    listeFemmes.addObserver(listePersonnes);
    listeFemmes.addObserver(listeFemmesXX�meSi�cle);
    listeFemmes.addObserver(listePersonnesXX�meSi�cle);
    listePersonnes.addObserver(listeFemmes);
    listePersonnes.addObserver(listeFemmesXX�meSi�cle);
    listePersonnes.addObserver(listePersonnesXX�meSi�cle);
    
 // ----------------- boucle de saisie des nouvelles personnes -----------------------
    
    System.out.println("Gestion de 4 listes de personnes : "+
    "liste de toutes les personnes, liste des personnes n�es au XX�me si�cle, liste des femmes, listes des femmes n�es au XX�me si�cle." + "\n");
    
    System.out.println("Les seules op�rations possibles sont : " + 
    "l'insertion d'une nouvelle personne dans la liste des personnes et l'insertion d'une nouvelle femme dans la liste des femmes." + "\n");
    
    System.out.println("Attention ! Toute personne (homme ou femme) saisie est ins�r�e dans la liste des personnes.");
    System.out.println("Attention ! Toute femme saisie est ins�r�e dans la liste des femmes." + "\n\n");
    
    char choix;
    boolean continuer = true;
    do
        {
        System.out.println("Liste de toutes les personnes:\n"+listePersonnes);
        System.out.println("Liste de toutes les femmes :\n" +listeFemmes);
        
        System.out.println("souhaitez-vous : saisir une personne ? (tapez 'p'), saisir une femme ? (tapez 'f'), quitter ? (tapez '/')");
     
        choix = lit1erCaract�re(clavier);
        
        if (choix =='/') continuer = false;
        else
            {
            System.out.println("tapez : pr�nom, ann�e de naissance");
            String s = clavier.readLine();
            
            if (choix == 'f')
                listeFemmes.add(new Femme(s));
            else
                if (choix == 'p')
                    {
                    System.out.println("genre de la personne ? tapez 'm' pour masculin, 'f' pour f�minin");
                    char genre = lit1erCaract�re(clavier);
                    Personne personne = (genre == 'm'? new Homme(s) : new Femme(s));
                    listePersonnes.add(personne);
                    }
            }
        }
    while (continuer);
    
    System.out.println("bye bye");
    }
catch (HeadlessException e)
    {
    System.err.println(e);
    e.printStackTrace();
    }
catch (FileNotFoundException e)
    {
   System.err.print("le fichier pour la sauvegarde de la liste des femmes du XX�me si�cle ne peut pas �tre cr��");
    }
catch (IOException e)
    {
    System.err.println("le clavier n'est pas disponible");
    }

}

}
