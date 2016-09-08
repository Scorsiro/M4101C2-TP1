public class ExpressionAddition extends ExpressionBinaire {

	/**
	 * 
	 * @param opg
	 * @param opd
	 */
	public ExpressionAddition(Operande opg, Operande opd) {
            super(opg,opd);
            
	}

        @Override
	public String getSymbole() {
		return "+"; 
	}

    @Override
    public Object accept(Visiteur visiteur) {
       return visiteur.visit(this);
    }

}