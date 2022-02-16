package component;

import java.util.Iterator;

public abstract class MenuComponent {
    private String name;

    public abstract void addComponent(MenuComponent component);

    protected MenuComponent(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public abstract void print();

    abstract Iterator<MenuComponent> getIterator();
}
