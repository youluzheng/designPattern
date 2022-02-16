package visitor;

public class Main {
    public static void main(String[] args) {
        SetMaterial setMaterial = new SetMaterial();
        Material material = new Paper();
        Material cuprum = new Cuprum();
        setMaterial.add(material);
        setMaterial.add(cuprum);
        Company artCompany = new ArtCompany();
        Company moneyCompany = new MoneyCompany();
        setMaterial.accept(artCompany);
        setMaterial.accept(moneyCompany);
    }
}
