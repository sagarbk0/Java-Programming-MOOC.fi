package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class BorderPaneApplication extends Application {
    
    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane group = new BorderPane();
        
        group.setTop(new Label("NORTH"));
        group.setRight(new Label("EAST"));
        group.setBottom(new Label("SOUTH"));
        
        Scene scene = new Scene(group);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
