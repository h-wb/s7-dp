package exoobserver.maquette;

public class Homme extends Personne
{

/**
 * @param pr�nom
 * @param ann�eNaissance
 */
public Homme(String pr�nom, int ann�eNaissance)
{
super(pr�nom, ann�eNaissance);
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


