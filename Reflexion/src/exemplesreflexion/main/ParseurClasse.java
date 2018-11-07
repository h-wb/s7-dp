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

        ligne = f.readLine();         // la 1ère ligne est ignorée car elle contient
        // uniquement un commentaire
        ligne = f.readLine().trim();    // la 2ème ligne contient le nom complet
        // (avec préfixe package) de la classe à instancier

        Class<?> maClasse = Class.forName(ligne); // on charge la classe à instancier.
        // La variable maClasse la représente
        Object résultat = maClasse.newInstance(); // on appelle le constructeur par défaut
        // de la classe chargée

        // les lignes suivantes contiennent les valeurs pour les champs à renseigner.
// On va boucler sur ces lignes

        while ((ligne = f.readLine()) != null) {
            String[] éléments = ligne.split("=");
            String nomChamp = éléments[0].trim();
            String sValeur = éléments[1].trim();

            String nomSetter = créeNomSetter(nomChamp);  // on crée le nom du setter
            // associé au champ à renseigner
            if (sValeur.endsWith(".txt")) {
                Field champ = maClasse.getDeclaredField(nomChamp);
                Class<?> typeChamp = champ.getType();    // typeChamp représente le type
                // du champ

                Method setter = maClasse.getMethod(nomSetter, typeChamp);

                File racine = new File(""); // contient le chemin d'où est lancée la JVM
                File ici = new File(racine.getAbsoluteFile(), "exemplesreflexion" + File.separatorChar + "cours");
                sValeur = ici.getAbsolutePath() + File.separatorChar + sValeur;

                setter.invoke(résultat, ParseurClasse.parse(sValeur));  // appel récursif
                // puis conversion de Object vers la classe représentée par typeChamp
            } else {
                Method setter = maClasse.getMethod(nomSetter, String.class);    // on obtient la méthode setChamp(String) associée au champ à renseigner
                setter.invoke(résultat, sValeur);                                                // on appelle le setter et on renseigne donc le champ
            }
        }
        f.close();
        return résultat;
    }    // parse

    /**
     * crée le nom du setter en fonction du nom du champ de la manière suivante :
     * <p>
     * nomDeChamp ---> setNomDeChamp(...)
     *
     * @param nomChamp : nom du champ respectant les conventions de nommage
     * @return nomSetter respectant les conventions de nommage
     */
    public static String créeNomSetter(String nomChamp) {
        char l = nomChamp.charAt(0);
        String nomSetter = "set" + Character.toUpperCase(l) + nomChamp.substring(1);
// on crée le nom du setter associé au champ à renseigner
        return nomSetter;
    }

    public static String créeNomGetter(String nomChamp) {
        char l = nomChamp.charAt(0);
        String nomGetter = "get" + Character.toUpperCase(l) + nomChamp.substring(1);
        return nomGetter;
    }

    public static void sauve(Object objet, String nomFichier) throws IOException, ClassNotFoundException, NoSuchMethodException {
        File racine = new File(""); // contient le chemin d'où est lancée la JVM
        File ici = new File(racine.getAbsoluteFile(), "exemplesreflexion" + File.separatorChar + "cours");
        File fichier = new File(ici.getAbsolutePath() + File.separatorChar + nomFichier);

        BufferedWriter writer = new BufferedWriter(new FileWriter(fichier));

        Class<?> c1 = Class.forName("exemplesreflexion.cours.Personne");
        writer.write("Données pour créer une instance de personne\n");

        for (Field t : c1.getDeclaredFields()) {

            String nomGetter = créeNomGetter(t.getName());
            Method getter = c1.getMethod(nomGetter, String.class);    // on obtient la méthode setChamp(String) associée au champ à renseigner
            getter.invoke(résultat, sValeur);

             System.out.println(nomGetter);

            writer.write(t.getName()+ " = "+ objet+"\n");

        }
        writer.close();

    }
}    // ParseurClasse

