package expression;

public class Constante implements Expression {

    private double constante;

    public Constante(double constante) {
        this.constante = constante;
    }

    public double getConstante() {
        return constante;
    }

    public void setConstante(double constante) {
        this.constante = constante;
    }

    public double getEvaluation() {
        return constante;
    }

    @Override
    public double getEvaluation(double x) {
        return x;
    }

    public String toString() {
        if((constante == Math.floor(constante)) && !Double.isInfinite(constante)){
            return String.valueOf((int)constante);
        } else return String.valueOf(constante);
    }
}
