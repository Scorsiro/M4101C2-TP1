public class ExpressionPuissance extends ExpressionBinaire {

        
        public ExpressionPuissance(Operande opg, Operande opd) {
		// TODO - implement ExpressionPuissance.ExpressionPuissance
		super(opg,opd);
	}
        
        
        @Override
	public String getSymbole() {
		// TODO - implement ExpressionPuissance.getSymbole
		return "^";
	}


        @Override
        public Object accept(Visiteur visiteur) {
            return visiteur.visit(this);
        }


}