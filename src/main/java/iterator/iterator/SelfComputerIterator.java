package iterator.iterator;

import java.util.Iterator;
import java.util.List;

public class SelfComputerIterator implements Iterator<Computer> {
    private List<Computer> computerList;
    private int current = 0;

    public SelfComputerIterator(List<Computer> computerList){
        this.computerList = computerList;
    }

    @Override
    public boolean hasNext() {
        return this.current < this.computerList.size();
    }

    @Override
    public Computer next() {
        return this.computerList.get(this.current++);
    }

}
