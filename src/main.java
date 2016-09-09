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

    /**
     * @param args the command line arguments
     */
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
        System.out.println("\nResultat attendu : ((2+3)*4) = 20");
        //Construction de l'expression
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
        System.out.println("\nResultat attendu : (((2+3)*4)/(12-7)) = 4");
        //Construction de l'expression 
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
        System.out.println("\nResultat attendu : (-(((((2+3)*4)/(12-7))^2)%5)) = -1");
        //Construction de l'expression
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
        
        
        
    }
    
}
