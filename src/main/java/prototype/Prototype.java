package prototype;

public class Prototype implements Cloneable{
    private String name;
    public Prototype(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Prototype getPrototype() throws CloneNotSupportedException {
        return this.clone();
    }
    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }
}
