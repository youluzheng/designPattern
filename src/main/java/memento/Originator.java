package memento;

public class Originator {
    private String state;
    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return this.state;
    }
    public Memento createMemento(){
        return new Memento(this.state);
    }
    public void restoreMemento(Memento memento){
        this.state = memento.getState();
    }
}
