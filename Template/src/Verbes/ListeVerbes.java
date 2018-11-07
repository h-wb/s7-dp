package Verbes;

import Verbes.Conjuguaison;

public class ListeVerbes {

    public Verbe[] ListeVerbes;

    public String conjugue(Conjuguaison conjuguaison) {
        String resultat = "";
        for(Verbe v: ListeVerbes){
            resultat+=conjuguaison.effectue(v)+'\n';
        }
        return resultat;
    }

}
