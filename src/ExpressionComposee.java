public abstract class ExpressionComposee extends Operande {

	Operande operandeGauche;

        
        public ExpressionComposee(Operande operandeGauche) {
                setOperandeGauche(operandeGauche);
        }
        
	public Operande getOperandeGauche() {
		return this.operandeGauche;
	}


	public void setOperandeGauche(Operande o) {
		this.operandeGauche = o ; 
	}

	public abstract String getSymbole();

        
       
}