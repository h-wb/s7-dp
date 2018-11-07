package Verbes;

import Verbes.Verbe;

public class VerbeGroupe3 extends Verbe {

    public VerbeGroupe3(String verbe) {
        super(verbe, "ir");
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
        return "ant ";
    }

    @Override
    String conjugueParticipePasse() {
        return "é";
    }
}
