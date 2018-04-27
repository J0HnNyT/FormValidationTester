package formvalidationtester;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Johnny
 */
public class FormValidationTester extends Application {
   
    Stage Window;
   
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FormValidationTester.fxml"));
        Scene scene = new Scene(root);
        Window = stage;
        Window.setTitle("Form Validation Tester");
        Window.setScene(scene);
        Window.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
   
}

