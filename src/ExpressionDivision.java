public class ExpressionDivision extends ExpressionBinaire {

	

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