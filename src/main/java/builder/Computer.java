package builder;

public class Computer {
    private String cpu;
    private String mouse;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", mouse='" + mouse + '\'' +
                '}';
    }
}
