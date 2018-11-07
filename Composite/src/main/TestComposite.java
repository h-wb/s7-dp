package main;

import expression.Constante;
import expression.Expression;
import expression.OperationBinaire;
import expression.Plus;

public class TestComposite {

    public static void main(String args[]) {
        Constante const1 = new Constante(1.3);
        Constante const2 = new Constante(2);

        Expression plus1 = new Plus(const1, const2);

        System.out.println(plus1.toString());
        System.out.println(plus1.getEvaluation(1));


    }

}

