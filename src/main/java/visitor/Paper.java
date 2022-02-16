package visitor;

public class Paper implements Material {
    @Override
    public void accept(Company company) {
        company.create(this);
    }
}
