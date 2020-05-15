package logic;

public abstract class EvaluateExpression {
    private static final String SUM             = "+";
    private static final String DIFFERENCE      = "-";
    private static final String DIVIDE          = "/";
    private static final String MULTIPLICATION  = "*";

    public static void calculateAndPrint(String inputLine) {
        String[] splittedExpression = inputLine.split(" ");
        if(splittedExpression.length <2) { //zabezpiecznie dla wyrażeń bez spacji "....."
            System.out.printf(inputLine);
            return;
        }

        String leftTerm     = splittedExpression[0];
        String operator     = splittedExpression[1];
        String rightTerm    = splittedExpression[2];

        switch(operator){
            case SUM            -> System.out.println(inputLine + " = " + sum(leftTerm,rightTerm));
            case DIFFERENCE     -> System.out.println(inputLine + " = " + difference(leftTerm,rightTerm));
            case DIVIDE         -> System.out.println(inputLine + " = " + divide(leftTerm,rightTerm));
            case MULTIPLICATION -> System.out.println(inputLine + " = " + multiplication(leftTerm,rightTerm));
            default -> System.out.println(inputLine);
        }
    }

    private static double sum(String arg1, String arg2){
        return Double.parseDouble(arg1)+Double.parseDouble(arg2);
    }

    private static double difference(String arg1, String arg2){
        return Double.parseDouble(arg1)-Double.parseDouble(arg2);
    }

    private static double divide(String arg1, String arg2){
        return Double.parseDouble(arg1)/Double.parseDouble(arg2);
    }

    private static double multiplication(String arg1, String arg2){
        return Double.parseDouble(arg1)*Double.parseDouble(arg2);
    }
}
