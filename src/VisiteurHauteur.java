
public class VisiteurHauteur extends Visiteur {

    @Override
    public Object visit(ExpressionAddition expression) {
        return Math.max((int)expression.getOperandeGauche().accept(this)+1, (int)expression.getOperandeDroite().accept(this)+1);
    }

    @Override
    public Object visit(ExpressionSoustraction expression) {
        return Math.max((int)expression.getOperandeGauche().accept(this)+1, (int)expression.getOperandeDroite().accept(this)+1);
    }

    @Override
    public Object visit(ExpressionMultiplication expression) {
        return Math.max((int)expression.getOperandeGauche().accept(this)+1, (int)expression.getOperandeDroite().accept(this)+1);
    }

    @Override
    public Object visit(ExpressionDivision expression) {
        return Math.max((int)expression.getOperandeGauche().accept(this)+1, (int)expression.getOperandeDroite().accept(this)+1);
    }

    @Override
    public Object visit(ExpressionModulo expression) {
        return Math.max((int)expression.getOperandeGauche().accept(this)+1, (int)expression.getOperandeDroite().accept(this)+1);
    }

    @Override
    public Object visit(ExpressionPuissance expression) {
        return Math.max((int)expression.getOperandeGauche().accept(this)+1, (int)expression.getOperandeDroite().accept(this)+1);
    }

    @Override
    public Object visit(ExpressionMoins expression) {
        return (int)expression.getOperandeGauche().accept(this)+1;
    }

    @Override
    public Object visit(Nombre expression) {
        return 1;
    }

    @Override
    public Object visit(Variable expression) {
        return 1;
    }
    
}
