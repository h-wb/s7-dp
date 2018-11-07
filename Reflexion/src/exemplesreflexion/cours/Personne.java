package exemplesreflexion.cours;

/**
 * classe cr��e pour tester les fonctionnalit�s de la r�flexion : c-�-d les propri�t�s de la classe Class<?>
 */
public class Personne {
    private String pr�nom;
    public String nom;

    private int taille; /* en cm */
    public double poids; /* en kg */
    private char sexe; /* 'M' ou 'F' */

    public Personne() {
        this("John", "Doe", 175, 76, 'm');
    }

    public Personne(String pr�nom, String nom, int taille, double poids, char sexe) {
        super();
        this.pr�nom = pr�nom;
        this.nom = nom;
        this.taille = taille;
        this.poids = poids;
        this.sexe = Character.toUpperCase(sexe);
    }

    public void setIdentit�(String pr�nom, String nom) {
        this.setPr�nom(pr�nom);
        this.setNom(nom);
    }

    public String getPr�nom() {
        return this.pr�nom;
    }

    public void setPr�nom(String pr�nom) {
        this.pr�nom = pr�nom;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTaille() {
        return this.taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public void setTaille(String taille) {
        this.setTaille(Integer.parseInt(taille.trim()));
    }

    public double getPoids() {
        return this.poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public void setPoids(String poids) {
        this.setPoids(Double.parseDouble(poids.trim()));
    }

    public char getSexe() {
        return this.sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public void setSexe(String sexe) {
        this.setSexe(sexe.trim().charAt(0));
    }

    @Override
    public String toString() {
        return "Personne [pr�nom=" + this.pr�nom + ", nom=" + this.nom + ", taille="
                + this.taille + ", poids=" + this.poids + ", sexe=" + this.sexe + "]";
    }

}
