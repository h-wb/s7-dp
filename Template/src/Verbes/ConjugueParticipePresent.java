package Verbes;

import Verbes.Conjuguaison;

public class ConjugueParticipePresent extends Conjuguaison {
    @Override
    public String effectue(Verbe verbe) {
        return "En " + verbe.radical + verbe.conjugueParticipePresent();
    }
}
