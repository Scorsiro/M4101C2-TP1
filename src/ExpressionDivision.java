public class ExpressionDivision extends ExpressionBinaire {

	

	/**
	 * 
	 * @param opg
	 * @param opd
	 */
	public void ExpressionDivision(Operande opg, Operande opd) {
		// TODO - implement ExpressionDivision.ExpressionDivision
		throw new UnsupportedOperationException();
	}

    @Override
    public void accept(Visiteur visiteur) {
        visiteur.visit(this);
    }
    
    public String getSymbole() {
		return "/";
    }

}