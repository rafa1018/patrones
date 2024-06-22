// Main.java
public class Main {
    public static void main(String[] args) {
        // Crear las expresiones
        Expression expression = buildExpression();

        // Interpretar y obtener el resultado
        int result = expression.interpret();
        System.out.println("Resultado: " + result); // Resultado: 10
    }

    public static Expression buildExpression() {
        // Aquí puedes construir cualquier expresión compleja que desees evaluar
        Expression exp1 = new AddExpression(new NumberExpression(2), new NumberExpression(3));
        Expression exp2 = new SubtractExpression(exp1, new NumberExpression(1));
        Expression exp3 = new AddExpression(exp2, new NumberExpression(6));

        return exp3;
    }
}
