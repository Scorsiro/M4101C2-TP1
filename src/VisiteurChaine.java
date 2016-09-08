public class VisiteurChaine extends Visiteur {

	/**
	 * 
	 * @param expression
	 */
	public Object visit(ExpressionAddition expression) {
		// TODO - implement VisiteurChaine.visit
                /*System.out.print("(");
                expression.getOperandeGauche().accept(this);
                System.out.print("+");
                expression.getOperandeDroite().accept(this);
                System.out.print(")");*/
                return ("("+expression.getOperandeGauche().accept(this)+"+"+expression.getOperandeDroite().accept(this)+")");
	}

	/**
	 * 
	 * @param expression
     * @return 
	 */
        @Override
	public Object visit(ExpressionSoustraction expression) {
		// TODO - implement VisiteurChaine.visit
                return ("("+expression.getOperandeGauche().accept(this)+"-"+expression.getOperandeDroite().accept(this)+")");
	}

	/**
	 * 
	 * @param expression
     * @return 
	 */
        @Override
	public Object visit(ExpressionMultiplication expression) {
		// TODO - implement VisiteurChaine.visit
                return ("("+expression.getOperandeGauche().accept(this)+"*"+expression.getOperandeDroite().accept(this)+")");
	}

	/**
	 * 
	 * @param expression
     * @return 
	 */
        @Override
	public Object visit(ExpressionDivision expression) {
		// TODO - implement VisiteurChaine.visit
                return ("("+expression.getOperandeGauche().accept(this)+"/"+expression.getOperandeDroite().accept(this)+")");
	}

        @Override
        public Object visit(ExpressionModulo expression) {
                return ("("+expression.getOperandeDroite().accept(this)+"%"+expression.getDegre()+")");
        }

        @Override
        public Object visit(ExpressionPuissance expression) {
                return ("("+expression.getOperandeDroite().accept(this)+"^"+expression.getDegre()+")");
        }

        @Override
        public Object visit(ExpressionMoins expression) {
                return ("(-"+expression.getOperandeDroite().accept(this)+")");
        }

        @Override
        public Object visit(Nombre expression) {
                return expression.getN();
        }

        @Override
        public Object visit(Variable expression) {
                return expression.getN();
        }

}