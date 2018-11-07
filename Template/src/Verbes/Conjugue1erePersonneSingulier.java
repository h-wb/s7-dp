package Verbes;

import Verbes.Conjuguaison;

public class Conjugue1erePersonneSingulier extends Conjuguaison {

    @Override
    public String effectue(Verbe verbe) {
        return "Je " + verbe.radical + verbe.conjugue1erePersonneSingulier();
    }
}
