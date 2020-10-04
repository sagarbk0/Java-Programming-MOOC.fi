package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import static javafx.application.Application.launch;
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
        TextArea text = new TextArea("");
        
        layout.setCenter(text);
        
        HBox bottomComponents = new HBox();
        bottomComponents.setSpacing(10);
        
        Label letters = new Label();
        Label words = new Label();
        Label longestWord = new Label();
        
        text.textProperty().addListener((change, oldValue, newValue) -> {
            int length = newValue.length();
            
            String[] parts = newValue.split(" ");
            int numWords = parts.length;
            
            String longest = Arrays.stream(parts)
                    .sorted((word1, word2) -> word2.length()-word1.length())
                    .findFirst()
                    .get();
            
            letters.setText("Letters: " + length);
            words.setText("Words: " + numWords);
            longestWord.setText("The longest word is: " + longest);
        });
        
        bottomComponents.getChildren().addAll(letters, words, longestWord);
        
        layout.setBottom(bottomComponents);
        
        Scene scene = new Scene(layout);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
