public abstract class ExpressionBinaire extends ExpressionComposee {

	Operande operandeDroite;

        public ExpressionBinaire(Operande operandeGauche, Operande operandeDroite) {
            super(operandeGauche);
            setOperandeDroite(operandeDroite);
        }

	public Operande getOperandeDroite() {
		return this.operandeDroite;
	}

	/**
	 * 
	 * @param o
	 */
	public void setOperandeDroite(Operande o) {
		this.operandeDroite = o;
	}

}