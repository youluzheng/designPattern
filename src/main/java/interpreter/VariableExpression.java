package interpreter;

public class VariableExpression implements Expression{
    @Override
    public int interpret(String context) {
        return Integer.parseInt(context);
    }
}
