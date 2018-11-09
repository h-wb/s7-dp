package expression;

public class Exposant extends OperationBinaire {

    public Exposant(Expression gauche, Expression droite) {
        super(gauche, droite);
        this.operateur = "^";
    }

    @Override
    public double getEvaluation(double x) {
        return Math.pow(this.gauche.getEvaluation(x), this.droite.getEvaluation(x)) ;
    }
}
