package exoobserver.maquette;

public abstract class Personne
{
private String prénom;
private int annéeNaissance;

/**
 * @param prénom
 * @param annéeNaissance
 */
public Personne(String prénom, int annéeNaissance)
{
this.prénom = prénom;
this.annéeNaissance = annéeNaissance;
}

/**
 * @param s respectant le format prénom , année de naissance. Exemple : Christophe, 1985
 * Le séparateur est une virgule
 * 
 * */
public Personne(String s)
{
String t[] = s.split(",");

this.prénom = t[0].trim();
this.annéeNaissance = Integer.parseInt(t[1].trim());
}

public int getAnnéeNaissance()
{
return this.annéeNaissance;
}

public abstract String getSexe();       

@Override
public String toString()
{
return  this.prénom + ", année de naissance : "
        + this.annéeNaissance + ", sexe : " + this.getSexe();
} 

}
