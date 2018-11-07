package exoobserver.maquette;

public class Homme extends Personne
{

/**
 * @param prénom
 * @param annéeNaissance
 */
public Homme(String prénom, int annéeNaissance)
{
super(prénom, annéeNaissance);
}

/**
 * @param s
 */
public Homme(String s)
{
super(s);
}

@Override
public String getSexe(){return "masculin";}

}


