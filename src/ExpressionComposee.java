public abstract class ExpressionComposee extends Operande {

	Operande operandeDroite;

        
        public ExpressionComposee(Operande operandeDroite) {
            setOperandeDroite(operandeDroite);
        }
        
	public Operande getOperandeDroite() {
		return this.operandeDroite;
	}

    

	public void setOperandeDroite(Operande o) {
		// TODO - implement ExpressionComposee.setOperandeDroite
		this.operandeDroite = o ; 
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
            this.setOperandeDroite(this);
            
		
	}*/
}