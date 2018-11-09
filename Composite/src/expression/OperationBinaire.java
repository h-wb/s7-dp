package expression;

public abstract class OperationBinaire implements Expression {

    protected Expression gauche;
    protected Expression droite;
    protected String operateur;

    public OperationBinaire(Expression gauche, Expression droite){
        this.gauche = gauche;
        this.droite = droite;
    }

    public String toString() {
        return "("+this.gauche.toString() + this.operateur + this.droite.toString() + ")";
    }

}
