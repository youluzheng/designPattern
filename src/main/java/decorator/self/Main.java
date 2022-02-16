package decorator.self;

public class Main {
    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast(Beverage.BIG);
        darkRoast.addCondiment(new Milk());
        System.out.println("cost:" + darkRoast.cost() + ", description:" + darkRoast.getDescription());
        darkRoast.addCondiment(new Mocha());
        System.out.println("cost:" + darkRoast.cost() + ", description:" + darkRoast.getDescription());
        Beverage darkRoast1 = new DarkRoast(Beverage.MIDDLE);
        darkRoast1.addCondiment(new Milk());
        System.out.println("cost:" + darkRoast1.cost() + ", description:" + darkRoast1.getDescription());
        darkRoast1.addCondiment(new Mocha());
        System.out.println("cost:" + darkRoast1.cost() + ", description:" + darkRoast1.getDescription());
    }
}
