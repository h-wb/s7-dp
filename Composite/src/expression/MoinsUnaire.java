package expression;

public class MoinsUnaire extends OperationUnaire {

    public MoinsUnaire(Expression expression) {
        super(expression);
        this.operateur = "-";
    }

    @Override
    public double getEvaluation(double x) {
        return - this.expression.getEvaluation(x);
    }
}
