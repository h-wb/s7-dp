package expression;

public class Variable implements Expression {

    @Override
    public double getEvaluation(double x) {
        return x;
    }

    @Override
    public String toString() {
        return "x";
    }
}
