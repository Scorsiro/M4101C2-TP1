
public class Variable extends ExpressionSimple {

    private char nom;

    public Variable(char nom, int n) {
        super(n);
        setNom(nom);
    }

    public char getNom() {
        return this.nom;
    }
 

    public void setNom(char nom) {
        this.nom = nom;
    }

    @Override
    public Object accept(Visiteur visiteur) {
        return visiteur.visit(this);
    }

}
