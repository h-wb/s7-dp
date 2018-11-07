package Main;

import Verbes.*;

public class TestVerbes {

    public static void main(String[] args) {

        Verbe[] ListeVerbes = {
                new VerbeGroupe1("danser"),
                new VerbeGroupe1GER("manger"),
                new VerbeGroupe2("frémir"),
                new VerbeGroupe2("finir"),
                new VerbeGroupe1("chanter"),
                new VerbeGroupe2("nourrir"),
                new VerbeGroupe1("parler"),
                new VerbeGroupe1("planter"),
                new VerbeGroupe1("porter"),
                new VerbeGroupe2("rugir"),
                new VerbeGroupe2("ralentir"),


        };
        Verbes.ListeVerbes l = new ListeVerbes();
        l.ListeVerbes = ListeVerbes;

        System.out.println(l.conjugue(new Conjugue1erePersonneSingulier()));
        System.out.println(l.conjugue(new Conjugue1erePersonnePluriel()));
        System.out.println(l.conjugue(new ConjugueParticipePasse()));
        System.out.println(l.conjugue(new ConjugueParticipePresent()));
    }
}
