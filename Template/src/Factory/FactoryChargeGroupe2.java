package Factory;

import Verbes.Verbe;
import Verbes.VerbeGroupe2;

import java.util.Vector;

public class FactoryChargeGroupe2 implements ChargeFactory {

    @Override
    public Verbe charge(String verbe) {
        return new VerbeGroupe2(verbe);
    }
}
