package logic;

public class EvaluateExpression {
    private static final String SUM             = "+";
    private static final String DIFFERENCE      = "-";
    private static final String DIVIDE          = "/";
    private static final String MULTIPLICATION  = "*";

    public static void CalculateExpressions(String inputLine) {
        String[] splittedExpression = inputLine.split(" ");
        if(splittedExpression.length <2) { //zabezpiecznie dla wyrażeń bez spacji "....."
            System.out.printf(inputLine);
            return;
        }
        switch(splittedExpression[1]){
            case SUM            -> System.out.println(inputLine + " = " + Sum(splittedExpression[0],splittedExpression[2]));
            case DIFFERENCE     -> System.out.println(inputLine + " = " + Difference(splittedExpression[0],splittedExpression[2]));
            case DIVIDE         -> System.out.println(inputLine + " = " + Divide(splittedExpression[0],splittedExpression[2]));
            case MULTIPLICATION -> System.out.println(inputLine + " = " + Multiplication(splittedExpression[0],splittedExpression[2]));
            default -> System.out.println(inputLine);
        }
    }

    private static double Sum(String arg1, String arg2){
        return Double.parseDouble(arg1)+Double.parseDouble(arg2);
    }

    private static double Difference(String arg1, String arg2){
        return Double.parseDouble(arg1)-Double.parseDouble(arg2);
    }

    private static double Divide(String arg1, String arg2){
        return Double.parseDouble(arg1)/Double.parseDouble(arg2);
    }

    private static double Multiplication(String arg1, String arg2){
        return Double.parseDouble(arg1)*Double.parseDouble(arg2);
    }
}
