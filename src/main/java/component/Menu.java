package component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent{
    private List<MenuComponent> components;

    public Menu(String name){
        super(name);
        this.components = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println("menu : " + this.getName());
    }

    @Override
    public void addComponent(MenuComponent component){
        this.components.add(component);
    }

    @Override
    Iterator<MenuComponent> getIterator() {
        return new MenuIterator(this.components);
    }
}
