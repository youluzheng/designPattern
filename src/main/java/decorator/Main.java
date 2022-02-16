package decorator;

public class Main {
    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast(Beverage.BIG);
        darkRoast = new Milk(darkRoast);
        System.out.println("cost : " + darkRoast.cost() + ", description : " + darkRoast.getDescription());
        darkRoast = new Mocha(darkRoast);
        System.out.println("cost : " + darkRoast.cost() + ", description : " + darkRoast.getDescription());
        Beverage darkRoast1 = new DarkRoast(Beverage.MIDDLE);
        darkRoast1 = new Milk(darkRoast1);
        System.out.println("cost : " + darkRoast1.cost() + ", description : " + darkRoast1.getDescription());
        darkRoast1 = new Mocha(darkRoast1);
        System.out.println("cost : " + darkRoast1.cost() + ", description : " + darkRoast1.getDescription());
    }
}
