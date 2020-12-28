package smiley;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;


public class SmileyApplication extends Application {
    @Override
    public void start(Stage window) {
        Canvas paintingCanvas = new Canvas(640, 480);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();
        
        BorderPane paintingLayout = new BorderPane();
        paintingLayout.setCenter(paintingCanvas);

        paintingCanvas.setOnMouseDragged((event) -> {
            double xLocation = event.getX();
            double yLocation = event.getY();
            painter.setFill(Color.BLACK);
            painter.fillOval(xLocation, yLocation, 4, 4);
        });
        
        paintingLayout.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(0), Insets.EMPTY)));
        
        drawSmiley(painter);
        
        Scene view = new Scene(paintingLayout);

        window.setScene(view);
        window.show();
    }
    
    private void drawSmiley(GraphicsContext gc) {
        double width = gc.getCanvas().getWidth();
        double height = gc.getCanvas().getHeight();
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(5);
        gc.setFill(Color.BLACK);
        gc.fillOval(width/2-80, height/2-80, 40, 40);
        gc.fillOval(width/2+30, height/2-80, 40, 40);
        gc.fillArc(width/2-60, height/2, 110, 60, 180, 180, ArcType.OPEN);
        gc.setLineWidth(1);
        gc.strokeOval(width/2-130,height/2-150,250,250);
    }

    public static void main(String[] args) {
        launch(args);
    }

}
