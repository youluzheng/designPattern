package facade;

public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new Light(), new Movie());
        homeTheaterFacade.startWatch();
        homeTheaterFacade.endWatch();
    }
}
