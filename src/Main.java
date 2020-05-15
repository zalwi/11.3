import logic.ExpressionsReader;

public class Main {
    public static void main(String[] args) {
        ExpressionsReader notedExpressions = new ExpressionsReader("data.txt");
        notedExpressions.readExpressionsAndShowResults();
    }
}
