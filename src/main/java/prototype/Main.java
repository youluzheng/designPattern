package prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype("张三");
        Prototype prototype1 = prototype.getPrototype();
        System.out.println(prototype1.getName());
    }
}
