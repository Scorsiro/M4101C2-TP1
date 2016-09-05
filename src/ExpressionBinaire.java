public abstract class ExpressionBinaire extends ExpressionComposee {

	Operande operandeGauche;

	public Operande getOperandeGauche() {
		return this.operandeGauche;
	}

	/**
	 * 
	 * @param o
	 */
	public void setOperandeGauche(Operande o) {
		this.operandeGauche = o;
	}

}