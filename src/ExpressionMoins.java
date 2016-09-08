public class ExpressionMoins extends ExpressionComposee {

        public ExpressionMoins(Operande operandeGauche) {
            super(operandeGauche);
        }

    
	public String getSymbole() {
		// TODO - implement ExpressionMoins.getSymbole
		return "-";
	}

	/**
	 * 
	 * @param opd
	 */

        @Override
        public Object accept(Visiteur visiteur) {
            return visiteur.visit(this);
        }

}