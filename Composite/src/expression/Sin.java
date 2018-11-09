package expression;

public class Sin extends OperationUnaire {

    public Sin(Expression expression) {
        super(expression);
        this.operateur = "sin";
    }

    @Override
    public double getEvaluation(double x) {
        return Math.sin(this.expression.getEvaluation(x));
    }
}
