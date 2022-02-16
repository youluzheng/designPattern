package templateMethod;

public abstract class CaffeineBeverage {
    public final void prepareRecipe() {
        this.boilWater();
        this.brew();
        this.pourInCup();
        if (this.needAddCondiments()) {
            this.addCondiments();
        }
    }

    private final void boilWater() {
        System.out.println("boil water");
    }

    private final void pourInCup() {
        System.out.println("pour in cup");
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    protected boolean needAddCondiments() {
        return false;
    }

}