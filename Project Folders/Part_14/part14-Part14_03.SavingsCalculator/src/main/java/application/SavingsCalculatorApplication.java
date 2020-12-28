package application;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane mainLayout = new BorderPane();
        
        VBox sliders = new VBox(5);
        
        BorderPane slider1Pane = new BorderPane();
        BorderPane slider2Pane = new BorderPane();
        
        slider1Pane.setLeft(new Label("Monthly savings"));
        slider2Pane.setLeft(new Label("Yearly interest rate"));
        
        Slider slider1 = new Slider(25, 250, 25);
        Slider slider2 = new Slider(0, 10, 0);
        
        slider1.setShowTickMarks(true);
        slider1.setShowTickLabels(true);

        slider2.setShowTickMarks(true);
        slider2.setShowTickLabels(true);
        
        slider1Pane.setCenter(slider1);
        slider2Pane.setCenter(slider2);
        
        Label slider1Val = new Label();
        
        Label slider2Val = new Label();
        
        slider1Pane.setRight(slider1Val);
        slider2Pane.setRight(slider2Val);
        
        sliders.getChildren().addAll(slider1Pane, slider2Pane);
        
        mainLayout.setTop(sliders);
        
        NumberAxis xAxis = new NumberAxis(0,30,1);
        NumberAxis yAxis = new NumberAxis();

        xAxis.setLabel("Year");
        yAxis.setLabel("CAD");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Savings Counter");
        
        XYChart.Series savingsChart = new XYChart.Series();
        savingsChart.setName("Savings Without Interest");
        
        XYChart.Series interestChart = new XYChart.Series();
        interestChart.setName("Savings With Interest");
        
        Double savings = slider1.valueProperty().get();
        Double interest = 1+slider2.valueProperty().get()*0.01;

        for(int i=0; i<31; i++) {
            XYChart.Data d = new XYChart.Data(i, 
                    i*12*savings);
            savingsChart.getData().add(d);
            
            if(i==0) {
                XYChart.Data e = new XYChart.Data(i,0);
                interestChart.getData().add(e);
            }
            
            if(i>0) {
                XYChart.Data e = new XYChart.Data(i,interest*(12*savings + 
                        Double.parseDouble(((XYChart.Data)interestChart.
                                getData().get(i-1)).getYValue().toString()))
                );
                interestChart.getData().add(e);
            }
        }
        
        slider1.valueProperty().addListener(new ChangeListener<Number>() {
                @Override
                public void changed(ObservableValue<? extends Number> ov, 
                        Number oldValue, Number newValue) {
                    Double savings = slider1.valueProperty().get();
                    Double interest = 1+slider2.valueProperty().get()*0.01;
                    
                    slider1Val.textProperty().set(String.format("%.1f", savings));
                    
                    for(int i=0; i<31; i++) {
                        XYChart.Data d = new XYChart.Data(i, 
                                i*12*savings);
                        savingsChart.getData().set(i, d);

                        if(i==0) {
                            XYChart.Data e = new XYChart.Data(i,0);
                            interestChart.getData().set(i, e);
                        }

                        if(i>0) {
                            XYChart.Data e = new XYChart.Data(i,interest*(12*savings + 
                                    Double.parseDouble(((XYChart.Data)interestChart.
                                            getData().get(i-1)).getYValue().toString()))
                            );
                            interestChart.getData().set(i, e);
                        }
                    }
                }
            }
        );
        
        slider2.valueProperty().addListener(new ChangeListener<Number>() {
                @Override
                public void changed(ObservableValue<? extends Number> ov, 
                        Number oldValue, Number newValue) {
                    Double savings = slider1.valueProperty().get();
                    Double interest = 1+slider2.valueProperty().get()*0.01;
                    
                    slider2Val.textProperty().set(String.format("%.2f", 
                            slider2.valueProperty().get()));
                    
                    for(int i=0; i<31; i++) {
                        if(i==0) {
                            XYChart.Data e = new XYChart.Data(i,0);
                            interestChart.getData().set(i, e);
                        }

                        if(i>0) {
                            XYChart.Data e = new XYChart.Data(i,interest*(12*savings + 
                                    Double.parseDouble(((XYChart.Data)interestChart.
                                            getData().get(i-1)).getYValue().toString()))
                            );
                            interestChart.getData().set(i, e);
                        }
                    }
                }
            }
        );
        lineChart.getData().add(savingsChart);
        lineChart.getData().add(interestChart);

        mainLayout.setCenter(lineChart);
        
        Scene view = new Scene(mainLayout, 640, 480);
        stage.setScene(view);
        stage.show();
    }

}
