package iterator.iterator;

public class Computer {
    private String name;
    private double price;

    public Computer(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void print() {
        System.out.println("----------------------");
        System.out.println("name is : " + this.name);
        System.out.println("price is : " + this.price);
    }
}
