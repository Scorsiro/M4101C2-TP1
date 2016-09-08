public class ExpressionMultiplication extends ExpressionBinaire {

	
	public ExpressionMultiplication(Operande opg, Operande opd) {
            super(opg,opd);
        }
        public String getSymbole() {
            return "*";
	}

    @Override
    public Object accept(Visiteur visiteur) {
        return visiteur.visit(this);
    }

}