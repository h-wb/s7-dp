package expression;

import java.util.ArrayList;
import java.util.Collection;

public class Plus extends OperationBinaire {


    public Plus(Expression gauche, Expression droite) {
        super(gauche, droite);
        this.operateur = "+";
    }

    @Override
    public double getEvaluation(double x) {
        return this.gauche.getEvaluation(x) + this.droite.getEvaluation(x);
    }
}
