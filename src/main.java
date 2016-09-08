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
        //créer objet
        Operande n1 = new Nombre(2);
        Operande n2 = new Nombre(3);
        Variable var = new Variable('t', ((Nombre)n1).getN());
        System.out.println(var.getNom());
        
        System.out.println(var.getN());
        
        ExpressionAddition expression = new ExpressionAddition(n1,n2);
        
        
        // TODO code application logic here
    }
    
}
