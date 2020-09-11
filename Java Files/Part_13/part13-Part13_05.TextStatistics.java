package textstatistics;

import javafx.application.Application;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application {


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane layout = new BorderPane();
        
        layout.setCenter(new TextArea(""));
        
        HBox bottomComponents = new HBox();
        bottomComponents.setSpacing(10);
        
        bottomComponents.getChildren().add(new Label("Letters: 0"));
        bottomComponents.getChildren().add(new Label("Words: 0"));
        bottomComponents.getChildren().add(new Label("The longest word is:"));
        
        layout.setBottom(bottomComponents);
        
        Scene scene = new Scene(layout);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
