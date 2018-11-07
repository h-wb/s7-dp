package Verbes;

import Verbes.VerbeGroupe1;

public class VerbeGroupe1GER extends VerbeGroupe1 {

    public VerbeGroupe1GER(String verbe) {
        super(verbe);
    }

    @Override
    protected boolean checkTerminaison(String radical) {
        return super.checkTerminaison(radical, "ger");
    }

    @Override
    String conjugue1erePersonnePluriel() {
        return "eons";
    }

    @Override
    String conjugueParticipePresent() {
        return "eant";
    }

}
