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
        Nombre n = new Nombre(2);
        Variable var = new Variable('t', n.getN());
        System.out.println(var.getNom());
        
        System.out.println(var.getN());
        // TODO code application logic here
    }
    
}
