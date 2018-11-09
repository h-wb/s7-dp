package main;

import expression.*;

public class TestComposite {

    public static void main(String args[]) {

        // Question 5
        double resultat;
        String expression;

        Variable v1 = new Variable();
        Constante c1= new Constante(5);
        Constante c2 = new Constante(2);
        Constante c3 = new Constante(1);

        Expression m1 = new Fois(c1, c2);

        Expression e1 = new Exposant(v1, c2);
        Expression p1 = new Plus(e1, c3);

        Expression e2 = new Exposant(p1, c1);

        Expression m2 = new Fois(m1, e2);

        expression = m2.toString();
        resultat = m2.getEvaluation(2);

        System.out.println(expression);
        System.out.println(resultat);


    }

}

