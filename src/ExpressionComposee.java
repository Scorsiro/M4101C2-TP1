public abstract class ExpressionComposee extends Operande {

	Operande operandeDroite;

	public Operande getOperandeDroite() {
		return this.operandeDroite;
	}

	public Operande setOperandeDroite() {
		// TODO - implement ExpressionComposee.setOperandeDroite
		throw new UnsupportedOperationException();
	}

	public abstract char getSymbole();

	/**
	 * 
	 * @param operateur
	 * @param operande
	 */
	public void ajouterOperande(char operateur, Operande operande) {
		// TODO - implement ExpressionComposee.ajouterOperande
		throw new UnsupportedOperationException();
	}

}