package exoobserver.maquette;

public abstract class Personne
{
private String pr�nom;
private int ann�eNaissance;

/**
 * @param pr�nom
 * @param ann�eNaissance
 */
public Personne(String pr�nom, int ann�eNaissance)
{
this.pr�nom = pr�nom;
this.ann�eNaissance = ann�eNaissance;
}

/**
 * @param s respectant le format pr�nom , ann�e de naissance. Exemple : Christophe, 1985
 * Le s�parateur est une virgule
 * 
 * */
public Personne(String s)
{
String t[] = s.split(",");

this.pr�nom = t[0].trim();
this.ann�eNaissance = Integer.parseInt(t[1].trim());
}

public int getAnn�eNaissance()
{
return this.ann�eNaissance;
}

public abstract String getSexe();       

@Override
public String toString()
{
return  this.pr�nom + ", ann�e de naissance : "
        + this.ann�eNaissance + ", sexe : " + this.getSexe();
} 

}
