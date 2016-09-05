public abstract class Visiteur {

	/**
	 * 
	 * @param expression
	 */
	public abstract void visit(ExpressionAddition expression);

	/**
	 * 
	 * @param expression
	 */
	public abstract void visit(ExpressionSoustraction expression);

	/**
	 * 
	 * @param expression
	 */
	public abstract void visit(ExpressionMultiplication expression);

	/**
	 * 
	 * @param expression
	 */
	public abstract void visit(ExpressionDivision expression);

}