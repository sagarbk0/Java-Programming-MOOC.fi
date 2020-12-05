package ticTacToe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class TicTacToeApplication extends Application {
    
    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane layout = new GridPane();
        Button[][] buttons = new Button[3][3];
        String[][] buttonText = new String[3][3];
        
        char[][] numsX = new char[3][3];
        char[][] numsO = new char[3][3];
        
        TicTacToeLogic logic = new TicTacToeLogic("X");
        
        Label turn = new Label("Turn: ");
        turn.setFont(Font.font("Monospaced", 40));
        turn.setText("Turn: " + logic.getCurrentUser());
        
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                buttonText[i][j] = " ";
                buttons[i][j] = new Button(" ");
                buttons[i][j].setFont(Font.font("Monospaced", 40));
            }
        }
        
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                int k = i;
                int l = j;
                buttons[i][j].setOnMouseClicked(e -> {
                    if(!logic.getEnd() && buttons[k][l].getText().equals(" ")) {
                        buttons[k][l].setText(logic.getCurrentUser());

                        if(logic.getCurrentUser().equals("O")) {
                            numsO[k][l] = 'y';
                        } else {
                            numsX[k][l] = 'y';
                        }

                        turn.setText(logic.findWinningPairs(buttons, numsO, numsX));

                        if(!turn.getText().equals("The end!")) {
                            logic.changeCurrentUser();

                            turn.setText("Turn: " + logic.getCurrentUser());
                        }
                    }
                });
            }
        }

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                layout.add(buttons[i][j], i, j);
            }
        }
        
        BorderPane menu = new BorderPane();
        menu.setTop(turn);
        menu.setCenter(layout);
        
        Scene scene = new Scene(menu);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void setButtonText(Button button, String text) {
        button.setText(text);
    }
}
