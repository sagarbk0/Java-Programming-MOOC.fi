package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application {
    
    

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("button");
        TextField text = new TextField(" text");
        
        FlowPane group = new FlowPane();
        group.getChildren().add(button);
        group.getChildren().add(text);
        
        Scene scene = new Scene(group);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
