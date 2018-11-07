package expression;

public class Constante implements Expression {

    private double constante;

    public double getConstante() {
        return constante;
    }

    public void setConstante(double constante) {
        this.constante = constante;
    }

    @Override
    public double getEvaluation() {
        return constante;
    }
}
