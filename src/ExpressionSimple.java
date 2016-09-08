public abstract class ExpressionSimple extends Operande {

	private int n;

        public ExpressionSimple(int n) {
            setN(n);
        }

	public int getN() {
		return this.n;
	}

	/**
	 * 
	 * @param n
	 */
	public void setN(int n) {
		this.n = n;
	}

}