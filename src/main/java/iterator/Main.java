package iterator;

import iterator.iterator.Computer;
import iterator.iterator.ComputerStore;

import java.util.Iterator;

public class Main {
    private Iterator<Computer> iterator;

    public Main(Iterator<Computer> iterator){
        this.iterator = iterator;
    }

    public void print(){
        while(this.iterator.hasNext()){
            this.iterator.next().print();
        }
    }

    public static void main(String[] args) {
        Computer computer1 = new Computer("computer1", 200.0);
        Computer computer2 = new Computer("computer2", 100.0);
        ComputerStore computerStore = new ComputerStore();
        computerStore.addComputer(computer1);
        computerStore.addComputer(computer2);

        Main main = new Main(computerStore.getIterator1());
        Main main1 = new Main(computerStore.getIterator2());
        main.print();
        main1.print();
    }
}
