package visitor;

public class ArtCompany implements Company{
    @Override
    public void create(Paper paper) {
        System.out.println("create art paper");
    }

    @Override
    public void create(Cuprum cuprum) {
        System.out.println("create art cuprum");
    }
}
