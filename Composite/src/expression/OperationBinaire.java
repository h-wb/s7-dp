package expression;

public class OperationBinaire implements Expression {

    private Expression gauche;
    private Expression droite;
    private String operateur;

    public OperationBinaire(Expression gauche, Expression droite){
        this.gauche = gauche;
        this.droite = droite;
    }

    public String toString() {
        return this.gauche.toString() + this.operateur + this.droite.toString();
    }

}
