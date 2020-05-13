package logic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExpressionsReader {

    private String fileName;

    public ExpressionsReader(String fileName) {
        this.fileName = fileName;
    }

    public void readExpressionsAndShowResults(){
        try(
                var fileReader = new FileReader(fileName);
                var reader = new BufferedReader(fileReader);
        ){
            String nextLine = null;
            while ((nextLine = reader.readLine()) != null) {
                EvaluateExpression.CalculateExpressions(nextLine);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
