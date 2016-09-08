public abstract class Visiteur {


	public abstract Object visit(ExpressionAddition expression);

	public abstract Object visit(ExpressionSoustraction expression);

	public abstract Object visit(ExpressionMultiplication expression);

	public abstract Object visit(ExpressionDivision expression);
        
        public abstract Object visit(ExpressionModulo expression);
        public abstract Object visit(ExpressionPuissance expression);
        public abstract Object visit(ExpressionMoins expression);
        public abstract Object visit(Nombre expression);
        public abstract Object visit(Variable expression);

    

}