package observer;

import java.util.ArrayList;
import java.util.List;

public class NewspaperOffice implements Observable {
    List<Observer> observers = new ArrayList<>();

    private String news;

    public String getNews() {
        return news;
    }

    @Override
    synchronized public void registerObserver(Observer observer) {
        if (!this.observers.contains(observer)) {
            this.observers.add(observer);
        }
    }

    @Override
    synchronized public void removeObserver(Observer observer) {
        int index = this.observers.indexOf(observer);
        if (index != -1) {
            this.observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (var observer : this.observers) {
            observer.update(this);
        }
    }

    public void postNews(String news) {
        this.news = news;
        this.notifyObservers();
    }

}
