package component;

import java.util.Iterator;

public class Main {
    private MenuComponent component;

    public Main(MenuComponent component){
        this.component = component;
    }

    public void print(){
        this.component.print();
        Iterator<MenuComponent> iterator = this.component.getIterator();
        while(iterator.hasNext()){
            iterator.next().print();
        }
    }

    public static void main(String[] args) {
        MenuComponent menu = new Menu("out");
        MenuComponent menuItem1_1 = new MenuItem("menuItem1_1");
        MenuComponent menu1_2 = new Menu("menu1_2");
        MenuComponent menuItem1_2_1 = new MenuItem("menuItem1-2-1");
        MenuComponent menuItem1_2_2 = new MenuItem("menuItem1-2-2");
        menu.addComponent(menu1_2);
        menu.addComponent(menuItem1_1);
        menu1_2.addComponent(menuItem1_2_1);
        menu1_2.addComponent(menuItem1_2_2);
        Main main = new Main(menu);
        main.print();
    }
}
