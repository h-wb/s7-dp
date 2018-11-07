package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Vector;

import Verbes.*;
import Chargeur.*;
/**
 * Chargement de deux fichiers textes contenant des verbes
 *
 * Le 1er fichier texte listeverbes1ergroupe.txt contient des verbes du 1er groupe
 *
 * Le 2�me fichier texte listeverbes2emegroupe.txt contient des verbes du 2�me groupe
 *
 * Les 2 fichiers sont situ�s sur le r�pertoire relatif exo_lecture_fichier_verbes/donnees
 *
 * */
public class TestChargeurListeVerbes
{

    public static void main(String[] args)
    {
        try
        {
            System.out.println("Exo sur les fabriques de verbes. Version sans les fabriques : doit �tre am�lior�e");
            File chemin = new File("");             // racine du projet : endroit d'o� est lanc�e la JVM
            System.out.println("chemin relatif = " + chemin);
            System.out.println("chemin absolu= " + chemin.getAbsolutePath());

            File cheminDonn�es = new File(chemin.getAbsoluteFile(), "chargeur" + File.separatorChar + "donnees"); // chemin du r�pertoire des donn�es
            System.out.println("cheminDonn�es = " + cheminDonn�es.getAbsolutePath());

            File cheminG1 = new File(cheminDonn�es.getAbsoluteFile(),"listeverbes1ergroupe.txt");

            BufferedReader f1 = new BufferedReader( new InputStreamReader( new FileInputStream(cheminG1.getAbsolutePath())));  // on ouvre le fichier de donn�es en lecture de texte

            Vector<Verbe> liste1 = ChargeurListeVerbes.chargeGroupe1(f1); // on charge la liste de verbes du 1er groupe

            System.out.println("\n"+"liste1 = " + liste1);

            File cheminG2 = new File(cheminDonn�es.getAbsoluteFile(),"listeverbes2emegroupe.txt");

            BufferedReader f2 = new BufferedReader( new InputStreamReader( new FileInputStream(cheminG2.getAbsolutePath())));  // on ouvre le fichier de donn�es en lecture de texte

            Vector<Verbe> liste2 = ChargeurListeVerbes.chargeGroupe2(f2); // on charge la liste de verbes du 2eme groupe

            System.out.println("\n"+"liste2 = " + liste2);

        }
        catch (FileNotFoundException e)
        {

            System.err.println("�chec du chargement d'un fichier de donn�es");
        }

    }

}
