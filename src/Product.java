public class Product extends Binary {

    public Product(int newLeft, int newRight) {
        super(newLeft, newRight);
        evaluate();
    }

    @Override
    public int evaluate() {
        return super.left * super.right;
    }
}