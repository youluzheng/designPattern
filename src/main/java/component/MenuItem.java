package component;

import java.util.Iterator;

public class MenuItem extends MenuComponent{

    @Override
    public void addComponent(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    public MenuItem(String name){
        super(name);
    }

    @Override
    public void print() {
        System.out.println("menuItem : " + this.getName());
    }

    @Override
    Iterator<MenuComponent> getIterator() {
        return new NoIterator();
    }
}
