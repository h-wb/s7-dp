package Factory;

import Verbes.Verbe;
import Verbes.VerbeGroupe1;

import java.util.Vector;

public class FactoryChargeGroupe1 implements ChargeFactory {

    @Override
    public Verbe charge(String verbe) {
        return new VerbeGroupe1(verbe);
    }
}
