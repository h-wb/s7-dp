package exoobserver.maquette;

public class Femme extends Personne
{

public Femme(String pr�nom, int ann�eNaissance)
{
super(pr�nom, ann�eNaissance);
}

/**
 * @param s
 */
public Femme(String s)
{
super(s);
}

@Override
public String getSexe(){return "f�minin";}

}
