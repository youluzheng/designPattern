package templateMethod;

public class Tea extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println("tea brew");
    }

    @Override
    protected void addCondiments() {
        System.out.println("add milk");
    }

    @Override
    protected boolean needAddCondiments() {
        return true;
    }

}
