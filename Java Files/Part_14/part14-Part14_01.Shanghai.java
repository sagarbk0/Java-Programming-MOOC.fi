package application;

import java.text.DecimalFormat;
import java.util.HashMap;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }

    @Override
    public void start(Stage stage) {
        // create the x and y axes that the chart is going to use
        NumberAxis xAxis = new NumberAxis(2006, 2018, 2);
        NumberAxis yAxis = new NumberAxis(0, 100, 10);

        // set the titles for the axes
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");
        
        int[] rankings = {73, 68, 72, 72, 74, 73, 76, 73, 67, 56, 56};
        int year = 2007;
        
        // create the line chart. The values of the chart are given as numbers
        // and it uses the axes we created earlier
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai ranking");

        // create the data set that is going to be added to the line chart
        XYChart.Series data = new XYChart.Series();

        // add the party's support numbers to the data set
        for(int i=0; i < 11; i++, year++) {
            data.getData().add(new XYChart.Data(year, rankings[i]));
        }

        // add the data set to the line chart
        lineChart.getData().add(data);
        
        // display the line chart
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }

}
