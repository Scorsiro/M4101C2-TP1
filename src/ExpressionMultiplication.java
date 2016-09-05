public class ExpressionMultiplication extends ExpressionBinaire {

	

	/**
	 * 
	 * @param opg
	 * @param opd
	 */
	public void ExpressionMultiplication(Operande opg, Operande opd) {
            this.setOperandeDroite(opd);
            this.setOperandeGauche(opg);
        }
        public String getSymbole() {
            return "*";
	}

    @Override
    public void accept(Visiteur visiteur) {
        visiteur.visit(this);
    }

}