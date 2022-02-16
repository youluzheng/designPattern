package chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public abstract class Handler {
    private List<Handler> handlers = new ArrayList<>();
    private int count;
    public void addHandler(Handler handler){
        this.handlers.add(handler);
    }
    public Handler getNext(){
        this.count++;
        return this.handlers.get(this.count);
    }
    public abstract void HandlerRequest(int i);
}
