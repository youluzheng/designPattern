package interpreter;

public class Context {
    private Expression OperatorExpress;

    public Context(){
        this.OperatorExpress = new OperatorExpression();
    }

    public int calculate(String express){
        int result =  this.OperatorExpress.interpret(express);
        System.out.println("the express \"" + express + "\" result is : " + result);
        return result;
    }
}
