package exoobserver.maquette;

import java.util.Vector;

public class Outils<E>
{

public  String toString(Vector<E> liste, String d�but,
        String s�parateur, String fin)
{
String s;
       
int i;
for ( i = 0, s = d�but; i < liste.size(); ++i)
    s += liste.get(i)+s�parateur;

return s+fin;
}

}
