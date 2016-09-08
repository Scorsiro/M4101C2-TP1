public class ExpressionModulo extends ExpressionBinaire {

    
        
	public ExpressionModulo(Operande opg, Operande opd) {
		// TODO - implement ExpressionModulo.ExpressionModulo
		super(opg, opd);
	}
        
        
	public String getSymbole() {
		// TODO - implement ExpressionModulo.getSymbole
		return "%";
	}

	

    @Override
    public Object accept(Visiteur visiteur) {
        return visiteur.visit(this);
    }

}