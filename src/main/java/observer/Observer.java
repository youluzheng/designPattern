package observer;

public interface Observer {
    void registerObservable(Observable observable);

    void removeObservable(Observable observable);

    void update(Observable observable);
}
