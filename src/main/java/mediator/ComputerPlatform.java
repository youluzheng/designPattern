package mediator;

public class ComputerPlatform extends Mediator {
    @Override
    public void delay(String type, String message) {
        if(type.equals("buyer")){
            for(var c:this.sellerColleagues){
                c.receive(message);
            }
        }else{
            for(var c:this.buyerColleagues){
                c.receive(message);
            }
        }
    }
}
