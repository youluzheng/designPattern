package interpreter;

public class AddExpression implements Expression{

    private Expression variable1;
    private Expression variable2;

    public AddExpression(Expression variable1, Expression variable2){
        this.variable1 = variable1;
        this.variable2 = variable2;
    }

    @Override
    public int interpret(String context) {
        String[] result = context.split("\\+");
        return this.variable1.interpret(result[0]) + this.variable2.interpret(result[1]);
    }
}
