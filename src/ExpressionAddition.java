public class ExpressionAddition extends ExpressionBinaire {

	/**
	 * 
	 * @param opg
	 * @param opd
	 */
	public void ExpressionAddition(Operande opg, Operande opd) {
            this.setOperandeGauche(opg) ; 
            this.setOperandeDroite(opd);
            
	}

	public String getSymbole() {
		return "+"; 
	}

    @Override
    public void accept(Visiteur visiteur) {
       visiteur.visit(this);
    }

}