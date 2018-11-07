package exoobserver.maquette;

import java.util.Vector;

public class Outils<E>
{

public  String toString(Vector<E> liste, String début,
        String séparateur, String fin)
{
String s;
       
int i;
for ( i = 0, s = début; i < liste.size(); ++i)
    s += liste.get(i)+séparateur;

return s+fin;
}

}
