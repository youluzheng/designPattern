package observer;

public class Main {
    public static void main(String[] args) {
        NewspaperOffice newspaperOffice = new NewspaperOffice();
        NewspaperOffice newspaperOffice2 = new NewspaperOffice();

        Worker worker = new Worker();
        worker.registerObservable(newspaperOffice);
        worker.registerObservable(newspaperOffice2);

        newspaperOffice.postNews("123");
        newspaperOffice2.postNews("456");

        worker.removeObservable(newspaperOffice);

        newspaperOffice.postNews("321");
        newspaperOffice2.postNews("654");
    }
}
