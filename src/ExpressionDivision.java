public class ExpressionDivision extends ExpressionBinaire {

	

	/**
	 * 
	 * @param opg
	 * @param opd
	 */
    public ExpressionDivision(Operande opg, Operande opd) {
        super(opg,opd);
    }

    @Override
    public Object accept(Visiteur visiteur) {
        return visiteur.visit(this);
    }
    
        @Override
    public String getSymbole() {
		return "/";
    }

}