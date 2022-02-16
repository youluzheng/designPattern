package iterator.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ComputerStore {
    List<Computer> computerList;

    public ComputerStore() {
        this.computerList = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        this.computerList.add(computer);
    }

    public Iterator<Computer> getIterator1() {
        return this.computerList.iterator();
    }

    public Iterator<Computer> getIterator2() {
        return new SelfComputerIterator(this.computerList);
    }
}