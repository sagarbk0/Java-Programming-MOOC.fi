package title;

import javafx.application.Application;
import javafx.stage.Stage;


public class UserTitle extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parameters params = getParameters();
        String title = params.getNamed().get("title");
        
        primaryStage.setTitle(title);
        primaryStage.show();
    }
   


}
