package interpreter;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.calculate("5+3");
        context.calculate("5-3");
    }
}
