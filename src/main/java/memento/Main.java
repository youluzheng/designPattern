package memento;

public class Main {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        originator.setState("state #1");
        System.out.println(originator.getState());
        caretaker.setMemento(originator.createMemento());
        originator.setState("state #2");
        System.out.println(originator.getState());
        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator.getState());
    }
}
