package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {
    
    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // create the x and y axes that the chart is going to use
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0,30,5);
        
        // set the titles for the axes
        xAxis.setLabel("Year");
        yAxis.setLabel("Relative support (%)");    
        
        // get the data from the file
        ArrayList<String[]> array = openFile();
        
        // create the line chart. The values of the chart are given as numbers
        // and it uses the axes we created earlier
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support in the years 1968-2008");

        for(int i=1; i<array.size(); i++) {
            XYChart.Series data = new XYChart.Series();
            data.setName(array.get(i)[0]);
            for(int j=1; j<array.get(i).length; j++) {
                if(!array.get(i)[j].equals("-")) {
                    data.getData().add(new XYChart.Data(
                            Integer.parseInt(array.get(0)[j]), 
                            Double.parseDouble(array.get(i)[j])));
                }
            }
            lineChart.getData().add(data);
        }
        
        // display the line chart
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }
    
    
    public static ArrayList openFile() throws Exception {
        ArrayList<String[]> output;
        try (BufferedReader tsvReader = new BufferedReader(new FileReader(
                "partiesdata.tsv"))) {
            String row = "";
            output = new ArrayList<>();
            while ((row = tsvReader.readLine()) != null) {
                String[] data = row.split("\t");
                output.add(data);
            }
        }
        return output;
    }
    
}
