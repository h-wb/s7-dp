package expression;

public abstract class OperationUnaire implements Expression {

    protected Expression expression;
    protected String operateur;

    public OperationUnaire(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return this.operateur + this.expression.toString();
    }
}
