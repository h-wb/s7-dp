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
 * Pour extraire le 1er caractère de la dernière ligne tapée sur le clavier
 * 
 * */
public static char lit1erCaractère(BufferedReader b) throws IOException
{
return b.readLine().trim().toLowerCase().charAt(0);
}

public static void main(String[] args) 
{
try
    {
    BufferedReader clavier = new BufferedReader(new InputStreamReader(System.in));  // pour lire des chaînes de caractères sur le clavier
    
    //---------------- création du fichier texte représentant la liste des femmes du XXème siècle ----------------------
    
    File ici = new File("");        // représente l'emplacement de la racine du projet, c-à-d de là où est lancée la JVM 
    
    String chemin = "petite_annexe";
    
    File petiteAnnexe = new File(ici.getAbsoluteFile(),chemin);
    
    petiteAnnexe.mkdir();       // création (s'il n'existe pas déjà) du sous-répertoire "petite_annexe" à partir de la racine du projet
    
    String cheminLocal = chemin+File.separatorChar+"listeFemmesXXemeSiecle.txt";     // création du chemin "petite_annexe/listeFemmesXXemeSiecle.txt"
    
    File f = new File(ici.getAbsoluteFile(), cheminLocal);      // représente le fichier texte "listeFemmesXXemeSiecle.txt" sur 
                                                                // le sous-répertoire "petite_annexe" du répertoire racine
    
    //-------------- création des 4 listes de personnes -----------------------------------
    
    ListePersonnes listePersonnes;
    ListeFemmes listeFemmes;
    ListePersonnesXXèmeSiècle listePersonnesXXèmeSiècle;
    ListeFemmesXXèmeSiècle listeFemmesXXèmeSiècle;
    
    listePersonnes = new ListePersonnes();
    listeFemmes = new ListeFemmes();
    listePersonnesXXèmeSiècle = new ListePersonnesXXèmeSiècle("liste des personnes du XXème Siècle"); // personnes nées au XXème siècle
    listePersonnesXXèmeSiècle.setVisible(true);
    listeFemmesXXèmeSiècle = new ListeFemmesXXèmeSiècle(f); // femmes nées au XXème siècle
    
    // ----------------- ici : insérer les instructions appropriées -----------------------
    
    listeFemmes.addObserver(listePersonnes);
    listeFemmes.addObserver(listeFemmesXXèmeSiècle);
    listeFemmes.addObserver(listePersonnesXXèmeSiècle);
    listePersonnes.addObserver(listeFemmes);
    listePersonnes.addObserver(listeFemmesXXèmeSiècle);
    listePersonnes.addObserver(listePersonnesXXèmeSiècle);
    
 // ----------------- boucle de saisie des nouvelles personnes -----------------------
    
    System.out.println("Gestion de 4 listes de personnes : "+
    "liste de toutes les personnes, liste des personnes nées au XXème siècle, liste des femmes, listes des femmes nées au XXème siècle." + "\n");
    
    System.out.println("Les seules opérations possibles sont : " + 
    "l'insertion d'une nouvelle personne dans la liste des personnes et l'insertion d'une nouvelle femme dans la liste des femmes." + "\n");
    
    System.out.println("Attention ! Toute personne (homme ou femme) saisie est insérée dans la liste des personnes.");
    System.out.println("Attention ! Toute femme saisie est insérée dans la liste des femmes." + "\n\n");
    
    char choix;
    boolean continuer = true;
    do
        {
        System.out.println("Liste de toutes les personnes:\n"+listePersonnes);
        System.out.println("Liste de toutes les femmes :\n" +listeFemmes);
        
        System.out.println("souhaitez-vous : saisir une personne ? (tapez 'p'), saisir une femme ? (tapez 'f'), quitter ? (tapez '/')");
     
        choix = lit1erCaractère(clavier);
        
        if (choix =='/') continuer = false;
        else
            {
            System.out.println("tapez : prénom, année de naissance");
            String s = clavier.readLine();
            
            if (choix == 'f')
                listeFemmes.add(new Femme(s));
            else
                if (choix == 'p')
                    {
                    System.out.println("genre de la personne ? tapez 'm' pour masculin, 'f' pour féminin");
                    char genre = lit1erCaractère(clavier);
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
   System.err.print("le fichier pour la sauvegarde de la liste des femmes du XXème siècle ne peut pas être créé");
    }
catch (IOException e)
    {
    System.err.println("le clavier n'est pas disponible");
    }

}

}
