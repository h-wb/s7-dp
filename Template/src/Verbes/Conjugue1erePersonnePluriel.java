package Verbes;

import Verbes.Conjuguaison;

public class Conjugue1erePersonnePluriel extends Conjuguaison {
    @Override
    public String effectue(Verbe verbe) {
        return "Nous " + verbe.radical + verbe.conjugue1erePersonnePluriel();
    }
}
