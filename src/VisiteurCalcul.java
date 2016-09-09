public class VisiteurCalcul extends Visiteur {

        
        
        @Override
        public Object visit(ExpressionAddition expression){
                
                return ((int)expression.getOperandeGauche().accept(this))+((int)expression.getOperandeDroite().accept(this));
        }

        @Override
	public Object visit(ExpressionSoustraction expression) {
		return ((int)expression.getOperandeGauche().accept(this))-((int)expression.getOperandeDroite().accept(this));
	}

        @Override
	public Object visit(ExpressionMultiplication expression) {
		return ((int)expression.getOperandeGauche().accept(this))*((int)expression.getOperandeDroite().accept(this));
	}

        @Override
	public Object visit(ExpressionDivision expression) {
		return ((int)expression.getOperandeGauche().accept(this))/((int)expression.getOperandeDroite().accept(this));
	}

        @Override
        public Object visit(ExpressionModulo expression) {
            return ((int)expression.getOperandeGauche().accept(this))%((int)expression.getOperandeDroite().accept(this));
        }

        @Override
        public Object visit(ExpressionPuissance expression) {
            return ((int)expression.getOperandeGauche().accept(this))^((int)expression.getOperandeDroite().accept(this));
        }

        @Override
        public Object visit(ExpressionMoins expression) {
            return -((int)expression.getOperandeGauche().accept(this));
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