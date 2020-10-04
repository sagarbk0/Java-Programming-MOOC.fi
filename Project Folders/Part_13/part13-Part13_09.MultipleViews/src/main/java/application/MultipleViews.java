package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    @Override
    public void start(Stage window) {
        Button transition1 = new Button("To the second view!");
        Button transition2 = new Button("To the third view!");
        Button transition3 = new Button("To the first view!");
        
        BorderPane view1 = new BorderPane();
        view1.setTop(new Label("First view!"));
        view1.setCenter(transition1);
        
        VBox view2 = new VBox();
        view2.setSpacing(10);
        view2.getChildren().add(transition2);
        view2.getChildren().add(new Label("Second view!"));
        
        GridPane view3 = new GridPane();
        view3.add(new Label("Third view!"), 0, 0);
        view3.add(transition3, 1, 1);
        
        Scene first = new Scene(view1);
        Scene second = new Scene(view2);
        Scene third = new Scene(view3);

        transition1.setOnAction((event) -> {
            window.setScene(second);
        });

        transition2.setOnAction((event) -> {
            window.setScene(third);
        });
        
        transition3.setOnAction((event) -> {
            window.setScene(first);
        });

        window.setScene(first);
        window.show();
    }

}
