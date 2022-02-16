package component;

import java.util.Iterator;
import java.util.List;

public class MenuIterator implements Iterator<MenuComponent> {
    private Iterator<MenuComponent> iterator;
    private Iterator<MenuComponent> currentIterator;
    private MenuComponent component;

    public MenuIterator(List<MenuComponent> componentList){
        this.iterator = componentList.iterator();
    }

    @Override
    public boolean hasNext() {
        if(this.currentIterator != null){
            if(this.currentIterator.hasNext()){
                this.component = this.currentIterator.next();
                return true;
            }
        }
        if(this.iterator.hasNext()){
            this.component = this.iterator.next();
            this.currentIterator = this.component.getIterator();
            return true;
        }
        return false;

    }

    @Override
    public MenuComponent next() {
        return this.component;
    }
}
