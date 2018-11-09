package expression;

public class Fois extends OperationBinaire {

    public Fois(Expression gauche, Expression droite) {
        super(gauche, droite);
        this.operateur = "*";
    }

    @Override
    public double getEvaluation(double x) {
        return this.gauche.getEvaluation(x) * this.droite.getEvaluation(x);
    }
}
