package visitor;

public class MoneyCompany implements Company{
    @Override
    public void create(Paper paper) {
        System.out.println("create money paper");
    }

    @Override
    public void create(Cuprum cuprum) {
        System.out.println("create money cuprum");
    }
}
