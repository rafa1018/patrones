// Main.java
public class Main {
    public static void main(String[] args) {
        // Crear las expresiones
        Expression expression = new SubtractExpression(
                new AddExpression(new NumberExpression(8), new NumberExpression(2)),
                new NumberExpression(1)
        );

        // Interpretar y obtener el resultado
        int result = expression.interpret();
        System.out.println("Resultado: " + result); // Resultado: 4
    }
}
