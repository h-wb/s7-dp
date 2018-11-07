package Verbes;

import Verbes.Verbe;

public class VerbeGroupe1 extends Verbe {

    public VerbeGroupe1(String verbe) {
        super(verbe, "er");
    }

    public VerbeGroupe1(String verbe, String terminaison) {
        super(verbe, terminaison);
    }



    @Override
    String conjugue1erePersonneSingulier() {
        return "e";
    }

    @Override
    String conjugue1erePersonnePluriel() {
        return "ons";
    }

    @Override
    String conjugueParticipePresent() {
        return "ant";
    }

    @Override
    String conjugueParticipePasse() {
        return "é";
    }
}
