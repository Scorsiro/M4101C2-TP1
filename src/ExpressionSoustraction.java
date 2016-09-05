public class ExpressionSoustraction extends ExpressionBinaire {

	

	/**
	 * 
	 * @param opg
	 * @param opd
	 */
	public void ExpressionSoustraction(Operande opg, Operande opd) {
		this.setOperandeDroite(opd);
                this.setOperandeGauche(opg);
	}

        public char getSymbole() {
            return '-'; 
	}
        
    @Override
    public void accept(Visiteur visiteur) {
        visiteur.visit(this);
    }

}