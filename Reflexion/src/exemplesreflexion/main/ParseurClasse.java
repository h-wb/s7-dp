package exemplesreflexion.main;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ParseurClasse {
    public static Object parse(String nomFichierInstance) throws

            IOException, ClassNotFoundException, InstantiationException, IllegalAccessException,
            SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
        BufferedReader f = new BufferedReader(new FileReader(nomFichierInstance));
        String ligne;

        ligne = f.readLine();         // la 1�re ligne est ignor�e car elle contient
        // uniquement un commentaire
        ligne = f.readLine().trim();    // la 2�me ligne contient le nom complet
        // (avec pr�fixe package) de la classe � instancier

        Class<?> maClasse = Class.forName(ligne); // on charge la classe � instancier.
        // La variable maClasse la repr�sente
        Object r�sultat = maClasse.newInstance(); // on appelle le constructeur par d�faut
        // de la classe charg�e

        // les lignes suivantes contiennent les valeurs pour les champs � renseigner.
// On va boucler sur ces lignes

        while ((ligne = f.readLine()) != null) {
            String[] �l�ments = ligne.split("=");
            String nomChamp = �l�ments[0].trim();
            String sValeur = �l�ments[1].trim();

            String nomSetter = cr�eNomSetter(nomChamp);  // on cr�e le nom du setter
            // associ� au champ � renseigner
            if (sValeur.endsWith(".txt")) {
                Field champ = maClasse.getDeclaredField(nomChamp);
                Class<?> typeChamp = champ.getType();    // typeChamp repr�sente le type
                // du champ

                Method setter = maClasse.getMethod(nomSetter, typeChamp);

                File racine = new File(""); // contient le chemin d'o� est lanc�e la JVM
                File ici = new File(racine.getAbsoluteFile(), "exemplesreflexion" + File.separatorChar + "cours");
                sValeur = ici.getAbsolutePath() + File.separatorChar + sValeur;

                setter.invoke(r�sultat, ParseurClasse.parse(sValeur));  // appel r�cursif
                // puis conversion de Object vers la classe repr�sent�e par typeChamp
            } else {
                Method setter = maClasse.getMethod(nomSetter, String.class);    // on obtient la m�thode setChamp(String) associ�e au champ � renseigner
                setter.invoke(r�sultat, sValeur);                                                // on appelle le setter et on renseigne donc le champ
            }
        }
        f.close();
        return r�sultat;
    }    // parse

    /**
     * cr�e le nom du setter en fonction du nom du champ de la mani�re suivante :
     * <p>
     * nomDeChamp ---> setNomDeChamp(...)
     *
     * @param nomChamp : nom du champ respectant les conventions de nommage
     * @return nomSetter respectant les conventions de nommage
     */
    public static String cr�eNomSetter(String nomChamp) {
        char l = nomChamp.charAt(0);
        String nomSetter = "set" + Character.toUpperCase(l) + nomChamp.substring(1);
// on cr�e le nom du setter associ� au champ � renseigner
        return nomSetter;
    }

    public static String cr�eNomGetter(String nomChamp) {
        char l = nomChamp.charAt(0);
        String nomGetter = "get" + Character.toUpperCase(l) + nomChamp.substring(1);
        return nomGetter;
    }

    public static void sauve(Object objet, String nomFichier) throws IOException, ClassNotFoundException, NoSuchMethodException {
        File racine = new File(""); // contient le chemin d'o� est lanc�e la JVM
        File ici = new File(racine.getAbsoluteFile(), "exemplesreflexion" + File.separatorChar + "cours");
        File fichier = new File(ici.getAbsolutePath() + File.separatorChar + nomFichier);

        BufferedWriter writer = new BufferedWriter(new FileWriter(fichier));

        Class<?> c1 = Class.forName("exemplesreflexion.cours.Personne");
        writer.write("Donn�es pour cr�er une instance de personne\n");

        for (Field t : c1.getDeclaredFields()) {

            String nomGetter = cr�eNomGetter(t.getName());
            Method getter = c1.getMethod(nomGetter, String.class);    // on obtient la m�thode setChamp(String) associ�e au champ � renseigner
            getter.invoke(r�sultat, sValeur);

             System.out.println(nomGetter);

            writer.write(t.getName()+ " = "+ objet+"\n");

        }
        writer.close();

    }
}    // ParseurClasse

