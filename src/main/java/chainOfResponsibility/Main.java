package chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Handler hander1 = new Hander1();
        Handler handler2 = new Hander2();
        hander1.setNext(new Hander2());
        handler2.setNext(new LastHander());
        hander1.HandlerRequest(5);
    }
}
