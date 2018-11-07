package Chargeur;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Vector;

import Factory.ChargeFactory;
import Verbes.*;

/**
 * responsable du chargement de listes de verbes � partir de fichiers textes
 *
 * */
public class ChargeurListeVerbes
{
    /**
     * @param : f suppos� �tre un fichier texte de la forme :
     *
     *      chanter
     *       danser
     *       travailler
     *       java
     *       jouer
     *       aboutir
     *       marcher
     *
     * C'est-�-dire que f contient un verbe du 1er groupe par ligne.
     * Chaque ligne suit le format :  infinitif d'un verbe du 1er groupe
     * La ligne peut contenir d'�ventuels espaces
     * Une ligne dont le format est inconnu ou contenant un verbe qui n'est pas du 1er groupe est ignor�e
     * f peut �tre vide
     *
     * @return la liste des verbes obtenus par lecture et parcours du fichier f
     * */
    public static Vector<Verbe> chargeGroupe1(BufferedReader f)
    {
        Vector<Verbe> liste = new Vector<Verbe>(); // cr�ation de la liste vide

        String ligneLue;        // la prochaine ligne � lire dans f

        try
        {
            do                              // on boucle sur les lignes du fichier : on lit le fichier ligne par ligne
            {
                ligneLue = f.readLine();    // lecture de la prochaine ligne dans le fichier


                if (ligneLue != null)   // on n'a pas atteint la fin de fichier
                    try
                    {
                        Verbe verbe = new VerbeGroupe1(ligneLue.trim());          // cr�ation du verbe correspondant � l'infinitif extrait du fichier

                        liste.add(verbe);                                           // on ajoute le nouveau verbe dans la liste
                    }
                    catch (IllegalArgumentException e)
                    {
                        // La ligne trait�e ne contenait pas l'infinitif d'un verbe du 1er groupe. Cette ligne est donc ignor�e.
                    }

            }
            while(ligneLue != null);    // tant que le fichier n'est pas enti�rement parcouru
        }
        catch (IOException e)
        {
            // il y un pb de lecture avec le fichier f. On s'arr�te l� et on retourne la liste qu'on a construit jusqu'� pr�sent
        }

        return liste;
    }

    /**
     * @param : f suppos� �tre un fichier texte de la forme :
     *
     *      fr�mir
     *      atterrir
     *      v�lo
     *      r�fl�chir
     *      permettre
     *      nourrir
     *      naviguer
     *      finir
     *
     * C'est-�-dire que f contient un verbe du 2�me groupe par ligne.
     * Chaque ligne suit le format :  infinitif d'un verbe du 2�me groupe
     * La ligne peut contenir d'�ventuels espaces
     * Une ligne dont le format est inconnu ou contenant un verbe qui n'est pas du 2�me groupe est ignor�e
     * f peut �tre vide
     *
     * @return la liste des verbes obtenus par lecture et parcours du fichier f
     * */
                  public static Vector<Verbe> chargeGroupe2(BufferedReader f)
                {
                    Vector<Verbe> liste = new Vector<Verbe>(); // cr�ation de la liste vide

                    String ligneLue;        // la prochaine ligne � lire dans f

                    try
                    {
                        do                              // on boucle sur les lignes du fichier : on lit le fichier ligne par ligne
                        {
                            ligneLue = f.readLine();    // lecture de la prochaine ligne dans le fichier


                if (ligneLue != null)   // on n'a pas atteint la fin de fichier
                    try {
                        Verbe verbe = new ChargeFactory(ligneLue.trim());          // cr�ation du verbe correspondant � l'infinitif extrait du fichier

                        liste.add(verbe);                                           // on ajoute le nouveau verbe dans la liste
                    } catch (IllegalArgumentException e) {
                        // La ligne trait�e ne contenait pas l'infinitif d'un verbe du 2�me groupe. Cette ligne est donc ignor�e.
                    }

            }
            while(ligneLue != null);    // tant que le fichier n'est pas enti�rement parcouru
        }
        catch (IOException e)
        {
            // il y un pb de lecture avec le fichier f. On s'arr�te l� et on retourne la liste qu'on a construit jusqu'� pr�sent
        }

        return liste;
    }

}
