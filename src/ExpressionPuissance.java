public class ExpressionPuissance extends ExpressionComposee {

	private int degre;

        
        public ExpressionPuissance(int degre, Operande opd) {
		// TODO - implement ExpressionPuissance.ExpressionPuissance
		super(opd);
                setDegre(degre);
	}
        
        
	public String getSymbole() {
		// TODO - implement ExpressionPuissance.getSymbole
		return "*"+this.getDegre();
	}


    @Override
    public Object accept(Visiteur visiteur) {
        return visiteur.visit(this);
    }

    /**
     * @return the degre
     */
    public int getDegre() {
        return degre;
    }

    /**
     * @param degre the degre to set
     */
    public void setDegre(int degre) {
        this.degre = degre;
    }

}