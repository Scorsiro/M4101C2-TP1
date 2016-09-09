public class ExpressionMoins extends ExpressionComposee {

        public ExpressionMoins(Operande operandeGauche) {
            super(operandeGauche);
        }

    
        @Override
	public String getSymbole() {
		return "-";
	}

        @Override
        public Object accept(Visiteur visiteur) {
            return visiteur.visit(this);
        }

}