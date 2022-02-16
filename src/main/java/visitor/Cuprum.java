package visitor;

public class Cuprum implements Material{
    @Override
    public void accept(Company company) {
        company.create(this);
    }
}
