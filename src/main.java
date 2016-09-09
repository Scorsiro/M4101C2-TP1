/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author munierto
 */
public class main {

    public static void main(String[] args) {
        
        //Instanciation des visiteurs
        Visiteur visiteurCalcul = new VisiteurCalcul();
        Visiteur visiteurChaine = new VisiteurChaine();
        Visiteur visiteurHauteur = new VisiteurHauteur();
        
        
        
        /*------------------------- Resultat attendu : ((2+3)*4) = 20 -----------------------------*/
        /*
                  *
                 / \
                /   \
               +     4
              / \
             /   \
            2     3
        */
        System.out.println("\n**** Test Expression 1 ****");
        System.out.println("Resultat attendu : ((2+3)*4) = 20");
        //Construction de l'expression ((2+3)*4)
        ExpressionMultiplication expressionMult = new ExpressionMultiplication(new ExpressionAddition(new Variable('t',2),new Nombre(3)), new Nombre(4));
        System.out.print("Resultat Obtenu  : ");
        //Affichage de l'expression par le Vistiteur Chaine
        System.out.print(expressionMult.accept(visiteurChaine));
        System.out.print(" = ");
        //Affichage du résultat par le Visiteur Calcul
        System.out.println(expressionMult.accept(visiteurCalcul));
        //Affichage de la hauteur de l'arbre par le Visiteur Hauteur
        System.out.println("Hauteur de l'arbre attendue : 3");
        System.out.println("Hauteur de l'arbre obtenue  : "+expressionMult.accept(visiteurHauteur));
        /*-----------------------------------------------------------------------------------------*/
        
        
        
        /*---------------------- Resultat attendu : (((2+3)*4)/(12-7)) = 4 --------------------------*/
        /*
                     "/"
                    /    \
                   /      \
                 "*"      "-"
                 / \      / \
                /   \    /   \
              "+"    4  12    7
              / \
             /   \
            2     3
        */
        System.out.println("\n**** Test Expression 2 ****");
        System.out.println("Resultat attendu : (((2+3)*4)/(12-7)) = 4");
        //Construction de l'expression (((2+3)*4)/(12-7))
        ExpressionDivision expressionDivision = new ExpressionDivision(expressionMult, new ExpressionSoustraction(new Nombre(12), new Nombre(7)));
        System.out.print("Resultat Obtenu  : ");
        //Affichage de l'expression par le Vistiteur Chaine
        System.out.print(expressionDivision.accept(visiteurChaine));
        System.out.print(" = ");
        //Affichage du résultat par le Visiteur Calcul
        System.out.println(expressionDivision.accept(visiteurCalcul));
        //Affichage de la hauteur de l'arbre par le Visiteur Hauteur
        System.out.println("Hauteur de l'arbre attendue : 4");
        System.out.println("Hauteur de l'arbre obtenue  : "+expressionDivision.accept(visiteurHauteur));
        /*-----------------------------------------------------------------------------------------*/
        
        
        
        /*--------------- Resultat attendu : (-(((((2+3)*4)/(12-7))^2)%5)) = -1 -------------------*/
        /*
                               "-"
                               /
                              /
                            "%"
                            / \
                           /   \
                         "^"    5
                        /   \
                       /     \
                     "/"      2
                    /    \
                   /      \
                 "*"      "-"
                 / \      / \
                /   \    /   \
              "+"    4  12    7
              / \
             /   \
            2     3
        */
        System.out.println("\n**** Test Expression 3 ****");
        System.out.println("Resultat attendu : (-(((((2+3)*4)/(12-7))^2)%5)) = -1");
        //Construction de l'expression (-(((((2+3)*4)/(12-7))^2)%5))
        ExpressionMoins expressionMoins = new ExpressionMoins(new ExpressionModulo(new ExpressionPuissance(expressionDivision,new Nombre(2)),new Nombre(5)));
        System.out.print("Resultat Obtenu  : ");
        //Affichage de l'expression par le Vistiteur Chaine
        System.out.print(expressionMoins.accept(visiteurChaine));
        System.out.print(" = ");
        //Affichage du résultat par le Visiteur Calcul
        System.out.println(expressionMoins.accept(visiteurCalcul));
        //Affichage de la hauteur de l'arbre par le Visiteur Hauteur
        System.out.println("Hauteur de l'arbre attendue : 7");
        System.out.println("Hauteur de l'arbre obtenue  : "+expressionMoins.accept(visiteurHauteur));
        /*-----------------------------------------------------------------------------------------*/
        
        
        
        /*--------------- Resultat attendu : (2^((6^2)%20)) = 65536 -------------------*/
        /*
              "^"
              / \
             /   \
            2    "%"
                 / \
                /   \
              "^"   20
              / \
             /   \
            6     2
        */
        System.out.println("\n**** Test Expression 4 ****");
        System.out.println("Resultat attendu : (2^((6^2)%20)) = 65536");
        //Construction de l'expression (2^((6^2)%20))
        ExpressionPuissance expressionPuiss = new ExpressionPuissance(new Nombre(2), new ExpressionModulo(new ExpressionPuissance(new Nombre(6), new Nombre(2)), new Nombre(20)));
        System.out.print("Resultat Obtenu  : ");
        //Affichage de l'expression par le Vistiteur Chaine
        System.out.print(expressionPuiss.accept(visiteurChaine));
        System.out.print(" = ");
        //Affichage du résultat par le Visiteur Calcul
        System.out.println(expressionPuiss.accept(visiteurCalcul));
        //Affichage de la hauteur de l'arbre par le Visiteur Hauteur
        System.out.println("Hauteur de l'arbre attendue : 4");
        System.out.println("Hauteur de l'arbre obtenue  : "+expressionPuiss.accept(visiteurHauteur));
        /*-----------------------------------------------------------------------------------------*/
        
        
    }
    
}
