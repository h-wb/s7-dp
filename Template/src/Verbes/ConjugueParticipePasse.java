package Verbes;

import Verbes.Conjuguaison;

public class ConjugueParticipePasse extends Conjuguaison {
    @Override
    public String effectue(Verbe verbe) {
        return verbe.radical + verbe.conjugueParticipePasse();
    }
}
