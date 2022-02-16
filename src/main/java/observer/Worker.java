package observer;

import java.util.ArrayList;
import java.util.List;

public class Worker implements Observer {
    private List<Observable> observables = new ArrayList<>();

    @Override
    public void registerObservable(Observable observable) {
        if (!this.observables.contains(observable)) {
            observable.registerObserver(this);
            this.observables.add(observable);
        }
    }

    @Override
    public void removeObservable(Observable observable) {
        int index = this.observables.indexOf(observable);
        if (index != -1) {
            observable.removeObserver(this);
            this.observables.remove(index);
        }
    }

    @Override
    public void update(Observable observable) {
        if (observable instanceof NewspaperOffice) {
            NewspaperOffice newspaperOffice = (NewspaperOffice) observable;
            System.out.println("i am work, i got news : " + newspaperOffice.getNews());
        }
    }
}
