package expression;

public class Variable implements Expression {


    @Override
    public double getEvaluation(double x) {
        return x;
    }
}
