package interpreter;

/*

<expression> ::= <variable> <operator> <variable>
<operator> ::= +|-
<variable> ::= %d

 */
public interface Expression {
    int interpret(String context);
}
