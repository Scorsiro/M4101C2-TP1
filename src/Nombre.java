
public class Nombre extends ExpressionSimple {

    public Nombre(int n) {
        super(n);
    }

    @Override
    public Object accept(Visiteur visiteur) {
        return visiteur.visit(this);
    }



    /**
     *
     * @param n
     *
     */
}
