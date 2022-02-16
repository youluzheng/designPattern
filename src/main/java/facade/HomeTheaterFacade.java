package facade;

public class HomeTheaterFacade {
    private Light light;
    private Movie movie;

    public HomeTheaterFacade(Light light, Movie movie) {
        this.light = light;
        this.movie = movie;
    }

    void startWatch() {
        this.light.off();
        this.movie.turnOn();
    }

    void endWatch() {
        this.light.on();
        this.movie.turnOff();
    }
}