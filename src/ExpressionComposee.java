public abstract class ExpressionComposee extends Operande {

	Operande operandeGauche;

        
        public ExpressionComposee(Operande operandeGauche) {
            setOperandeGauche(operandeGauche);
        }
        
	public Operande getOperandeGauche() {
		return this.operandeGauche;
	}

    

	public void setOperandeGauche(Operande o) {
		// TODO - implement ExpressionComposee.setOperandeGauche
		this.operandeGauche = o ; 
	}

	public abstract String getSymbole();

	/**
	 * 
         * @param visiteur
	 * @param operateur
	 * @param operande
	 */
	
       //public abstract void accept(Visiteur visiteur);
        
       /*public void ajouterOperande(char operateur, Operande operande) {
            this.setOperandeGauche(this);
            
		
	}*/
}