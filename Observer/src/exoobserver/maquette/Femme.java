package exoobserver.maquette;

public class Femme extends Personne
{

public Femme(String prénom, int annéeNaissance)
{
super(prénom, annéeNaissance);
}

/**
 * @param s
 */
public Femme(String s)
{
super(s);
}

@Override
public String getSexe(){return "féminin";}

}
