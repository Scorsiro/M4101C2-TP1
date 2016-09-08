public class VisiteurChaine extends Visiteur {


        @Override
	public Object visit(ExpressionAddition expression) {
		// TODO - implement VisiteurChaine.visit
                return ("("+expression.getOperandeGauche().accept(this)+"+"+expression.getOperandeDroite().accept(this)+")");
	}


        @Override
	public Object visit(ExpressionSoustraction expression) {
		// TODO - implement VisiteurChaine.visit
                return ("("+expression.getOperandeGauche().accept(this)+"-"+expression.getOperandeDroite().accept(this)+")");
	}


        @Override
	public Object visit(ExpressionMultiplication expression) {
		// TODO - implement VisiteurChaine.visit
                return ("("+expression.getOperandeGauche().accept(this)+"*"+expression.getOperandeDroite().accept(this)+")");
	}

        @Override
	public Object visit(ExpressionDivision expression) {
		// TODO - implement VisiteurChaine.visit
                return ("("+expression.getOperandeGauche().accept(this)+"/"+expression.getOperandeDroite().accept(this)+")");
	}

        @Override
        public Object visit(ExpressionModulo expression) {
                return ("("+expression.getOperandeGauche().accept(this)+"%"+expression.getOperandeDroite().accept(this)+")");
        }

        @Override
        public Object visit(ExpressionPuissance expression) {
                return ("("+expression.getOperandeGauche().accept(this)+"^"+expression.getOperandeDroite().accept(this)+")");
        }

        @Override
        public Object visit(ExpressionMoins expression) {
                return ("(-"+expression.getOperandeGauche().accept(this)+")");
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