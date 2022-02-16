package interpreter;

public class OperatorExpression implements Expression{
    private Expression addExpress;
    private Expression subExpress;

    public OperatorExpression(){
        this.addExpress = new AddExpression(new VariableExpression(), new VariableExpression());
        this.subExpress = new SubExpression(new VariableExpression(), new VariableExpression());
    }

    @Override
    public int interpret(String context) {
        if(context.contains("+")){
            return this.addExpress.interpret(context);
        }
        return this.subExpress.interpret(context);
    }
}
