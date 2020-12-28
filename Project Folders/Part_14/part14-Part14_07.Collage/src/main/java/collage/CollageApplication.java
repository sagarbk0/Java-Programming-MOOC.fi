package collage;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CollageApplication extends Application {

    @Override
    public void start(Stage stage) {

        // the example opens the image, creates a new image, and copies the opened image
        // into the new one, pixel by pixel
        Image sourceImage = new Image("file:monalisa.png");

        PixelReader imageReader = sourceImage.getPixelReader();
        
        int width = (int) sourceImage.getWidth();
        int height = (int) sourceImage.getHeight();
        
        WritableImage targetImage = new WritableImage(width, height);
        
        drawImage(0,0,targetImage,imageReader,sourceImage);
        drawImage(width/2,0,targetImage,imageReader,sourceImage);
        drawImage(0,height/2,targetImage,imageReader,sourceImage);
        drawImage(width/2,height/2,targetImage,imageReader,sourceImage);
        
        ImageView image = new ImageView(targetImage);
        image = new ImageView(targetImage);
        image.setX(0);
        image.setY(0);
        
        Pane pane = new Pane();
        pane.getChildren().add(image);
        
//        Wrong approach        
//        ImageView images[] = new ImageView[4];
//        int positionsX[] = {-width/4, -width/4, width/4, width/4};
//        int positionsY[] = {-height/4, height/4, -height/4, height/4};
//        for(int i=0; i<4; i++) {
//            images[i] = new ImageView(targetImage);
//            images[i].setScaleX(0.5);
//            images[i].setScaleY(0.5);
//            images[i].setTranslateX(positionsX[i]);
//            images[i].setTranslateY(positionsY[i]);
//            pane.getChildren().add(images[i]);
//        }
        
        stage.setScene(new Scene(pane));
        stage.show();
    }
    
    public void drawImage(int xCoord, int yCoord, WritableImage targetImage, 
            PixelReader imageReader, Image sourceImage) {
        PixelWriter imageWriter = targetImage.getPixelWriter();
        int widthOrig = (int) sourceImage.getWidth();
        int heightOrig = (int) sourceImage.getHeight();
        
        int yCoordOrig = 0;
        Integer yCoordinate = yCoord;
        while (yCoordinate < heightOrig && yCoordOrig < heightOrig/2) {
            int xCoordOrig = 0;
            Integer xCoordinate = xCoord;
            while (xCoordinate < widthOrig && xCoordOrig < widthOrig/2) {
                Color color = imageReader.getColor((int)(xCoordOrig*2), (int)(yCoordOrig*2));
                double red = 1.0 - color.getRed();
                double green = 1.0 - color.getGreen();
                double blue = 1.0 - color.getBlue();
                double opacity = color.getOpacity();

                Color newColor = new Color(red, green, blue, opacity);

                imageWriter.setColor((int)(xCoordinate), (int)(yCoordinate), newColor);
                
                xCoordOrig++;
                xCoordinate++;
            }
            
            yCoordOrig++;
            yCoordinate++;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
