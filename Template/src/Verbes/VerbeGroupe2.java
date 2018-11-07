package Verbes;

import Verbes.Verbe;

public class VerbeGroupe2 extends Verbe {

    public VerbeGroupe2(String verbe) {
        super(verbe, "ir");
    }

    @Override
    String conjugue1erePersonneSingulier() {
        return "is";
    }

    @Override
    String conjugue1erePersonnePluriel() {
        return "issons";
    }

    @Override
    String conjugueParticipePresent() {
        return "issant";
    }

    @Override
    String conjugueParticipePasse() {
        return "i";
    }
}
